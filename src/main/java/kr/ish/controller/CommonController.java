 package kr.ish.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {

	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		
		log.info("........................access Denied : " + auth);
		
		model.addAttribute("msg", "Access Denied");
	}
	
	@GetMapping("/customSignIn")
	public void signInInput(String error, String signOut, Model model) {
		
		log.info("error: " + error);
		log.info("signOut: " + signOut);
		
		if(error != null) {
			model.addAttribute("error", "Signin Error. Check your account");
		}
		
		if(signOut != null) {
			model.addAttribute("signOut", "Sign Out!");
		}
			
	}
}
