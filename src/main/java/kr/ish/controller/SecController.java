package kr.ish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/*")
public class SecController {

	@GetMapping("/all")
	public void doAll() {
		
		log.info("...................................get | /all");
	}
	
	@GetMapping("/member")
	public void doMember() {
		
		log.info("...................................get | /member");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		
		log.info("...................................get | /admin");
	}
}