package com.tareq23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.model.User;

@Controller
public class UserController {
	
	
	@PostMapping("user-register")
	public ModelAndView userRegister(@ModelAttribute User user)
	{
		ModelAndView modelAndView = new ModelAndView("show-user-info");
		return modelAndView;
	}
}
