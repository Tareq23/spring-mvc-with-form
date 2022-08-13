package com.tareq23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView index()
	{
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		
		User user = new User();
		modelAndView.addObject("user",user);
		return modelAndView;
		
	}
	
}
