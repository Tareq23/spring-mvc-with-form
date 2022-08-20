package com.tareq23.controller;

import java.util.HashMap;
import java.util.Map;

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
		user.setEmail("");
		user.setPassword("");
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("bangladesh", "Bangladesh");
		countryMap.put("India", "India");
		countryMap.put("Pakistan", "Pakistan");
		countryMap.put("USA", "USA");
		countryMap.put("Russia", "Russia");
		modelAndView.addObject("user",user);
		modelAndView.addObject("countryMap",countryMap);
		return modelAndView;
		
	}
	
}
