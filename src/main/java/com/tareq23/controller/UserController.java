package com.tareq23.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.DAO.AppDAOImplements;
import com.tareq23.model.User;
import com.tareq23.spring.config.AppConfig;

@Controller
public class UserController {
	
	
	@GetMapping("/view-user")
	public ModelAndView viewUser()
	{
		ModelAndView modelAndView = new ModelAndView("viewUsers");
		
		
		List<User> users = new ArrayList<User>();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImplements DAO = context.getBean("DAOBean",AppDAOImplements.class);
		
		users = DAO.listUser();
		
		modelAndView.addObject("users",users);
		
		return modelAndView;
	}
	
	
	@GetMapping("/add-user")
	public ModelAndView addUser() {
		ModelAndView modelAndView = new ModelAndView("addUser");
		return modelAndView;
		
	}

}
