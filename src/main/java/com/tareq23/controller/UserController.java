package com.tareq23.controller;

import java.util.HashMap;
import java.util.Map;

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
			System.out.println(result);
			Map<String,String> countryMap = new HashMap<String, String>();
			countryMap.put("bangladesh", "Bangladesh");
			countryMap.put("India", "India");
			countryMap.put("Pakistan", "Pakistan");
			countryMap.put("USA", "USA");
			countryMap.put("Russia", "Russia");
			user.setEmail("");
			user.setPassword("");
			return new ModelAndView("index").addObject("user",user).addObject("countryMap", countryMap);
		}
		else {
			System.out.println("User has no errors");
			return modelAndView;
		}
//		System.out.println("user-register");
		
	}
}
