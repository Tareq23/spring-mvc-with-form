package com.tareq23.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.model.User;


@Controller
public class UserController {
	
	
	@PostMapping("user-register")
	public ModelAndView userRegister(@Valid @ModelAttribute("user") User user, BindingResult result)
	{
		ModelAndView modelAndView = new ModelAndView("show-user-info");
		
		modelAndView.addObject("user",user);
		
//		System.out.println(result);
		
		if(result.hasErrors()) {
			System.out.println("User has errors!");
		}
		else {
			System.out.println("User has no errors");
		}
		System.out.println("user-register");
		return modelAndView;
	}
}
