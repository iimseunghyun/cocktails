package kr.ish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ish.domain.CocktailsVO;
import kr.ish.service.CocktailsService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/admin/cocktails/*")
@AllArgsConstructor
public class CocktailsController {
	
	private CocktailsService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		
		log.info("........../cocktails/list");
		
		model.addAttribute("list", service.getCList());
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("cno") int cno, Model model) {
		
		log.info("........../cocktails/get");
		model.addAttribute("cock", service.getC(cno));
	}
	
	@PostMapping("/modify")
	public String modify(CocktailsVO cock, RedirectAttributes rttr) {
		
		log.info(".........../cocktails/moidfy: " +cock);
		
		if(service.modifyC(cock)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/cocktails/list";
	}
	
	@PostMapping("/remove")
	public String remove (@RequestParam("cno") int cno, RedirectAttributes rttr) {
		
		log.info("................./cocktails/remove" + cno);
		if(service.removeC(cno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/cocktails/list";
	}
	
}
