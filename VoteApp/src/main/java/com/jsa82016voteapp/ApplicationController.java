package com.jsa82016voteapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/")
	public String rootView() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
