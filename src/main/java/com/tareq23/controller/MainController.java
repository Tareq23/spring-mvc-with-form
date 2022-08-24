package com.tareq23.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.DAO.AppDAOImplements;
import com.tareq23.model.User;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView index()
	{
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		
		List<User> listUser = new ArrayList<User>();
		ClassPathXmlApplicationContext context
		
					= new ClassPathXmlApplicationContext("/com/tareq23/DAO/Spring-AppDAOConfig.xml");
		
		AppDAOImplements DAO = context.getBean("DAOBean", AppDAOImplements.class);
		
		
		listUser = DAO.listUser();
		
		System.out.println(listUser);
		
		User user = new User(null, null, null);
		Map<String,String> countryMap = new HashMap<String, String>();
		countryMap.put("bangladesh", "Bangladesh");
		countryMap.put("India", "India");
		countryMap.put("Pakistan", "Pakistan");
		countryMap.put("USA", "USA");
		countryMap.put("Russia", "Russia");
		modelAndView.addObject("user",user);
		modelAndView.addObject("countryMap",countryMap);
		
		modelAndView.addObject("users",listUser);
		return modelAndView;
		
	}
	
}
