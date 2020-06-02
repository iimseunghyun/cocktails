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
@AllArgsConstructor
public class AdminController {

	private MemberService service;
	
//	@GetMapping("/admin")
	public String adminIn() {
		return "/admin/adminIn";
	}
	
	@PostMapping
	public String adminIn(MemberVO member, RedirectAttributes rttr) {
			
		return "";
	}
	

}
