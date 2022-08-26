package com.tareq23.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		context.close();
		
		return modelAndView;
	}
	
	
	@GetMapping("/add-user")
	public ModelAndView addUserView() {
		ModelAndView modelAndView = new ModelAndView("addUser");
		modelAndView.addObject("user",new User());
		return modelAndView;
	}
	
	@PostMapping("/add-user")
	public ModelAndView addUser(@ModelAttribute("user") @Valid User user, BindingResult result)
	{
//		ModelAndView modelAndView = new ModelAndView("index");
//		
//		
//		modelAndView.addObject("user", user);
		
		if(result.hasErrors()) {
			System.out.println(result);
			return new ModelAndView("addUser").addObject("user",user);
		}
		else {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			AppDAOImplements DAO = context.getBean("DAOBean",AppDAOImplements.class);
			
			DAO.addUser(user);
			context.close();
			
			return this.viewUser();
		}
		
	}
	
}
