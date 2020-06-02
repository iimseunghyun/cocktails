package kr.ish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ish.domain.MemberVO;
import kr.ish.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
//@RequestMapping("/*")
@AllArgsConstructor								//=true ? signIn get/post 작동 : signIn get만 작동 , 아마 서비스 클래스 주입이 안되어서.
public class MembersController {
	
	private MemberService service;				
	
	@RequestMapping("/signUp")
	public void signUp() {
		
	}
	
	@PostMapping("/signUp")
	public String signUp(MemberVO member, RedirectAttributes rttr) {
		
		log.info("...........................signUp: " + member);
		
		service.signUp(member);
		
		rttr.addFlashAttribute("result", member.getName());
		
		return "redirect:/";
		}
	}
	

