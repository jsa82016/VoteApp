package com.jsa82016voteapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsa82016voteapp.models.User;
import com.jsa82016voteapp.services.UserServices;

@Controller
public class UserController {

	@Autowired
	private UserServices userService;
	
	@PostMapping(value="/register")
	public String addUser(User user) {
		userService.save(user);
		return "redirect:login";
	}
	
}
