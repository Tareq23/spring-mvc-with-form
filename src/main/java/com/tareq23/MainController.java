package com.tareq23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.model.User;

@Controller
public class MainController {

	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String welcome()
	{
		return "hello";
	}
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("user_form");
		User user = new User();
		
		Map<String,String>genderMap = new HashMap<String,String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		modelAndView.addObject("user",user);
		modelAndView.addObject("genderMap",genderMap);
		
		
		Map<String,String>countryMap = new HashMap<String,String>();
		
		countryMap.put("Bangladesh", "Bangladesh");
		countryMap.put("India", "India");
		countryMap.put("Pakistan", "Pakistan");
		countryMap.put("USA", "United States");
		countryMap.put("Russia", "Russia");
		
		modelAndView.addObject("countryMap",countryMap);
		
		return modelAndView;
	}
	
	
	
	
//	@RequestMapping(value="/display-name",method=RequestMethod.POST)
//	public String displayName(HttpServletRequest request)
//	{
//		String name = request.getParameter("name");
//		request.setAttribute("name", name);
//		return "index";
//	}
	
//	@PostMapping("/display-name")
//	public String displayName(@RequestParam("name") String name, Model model) {
//		
//		ModelAndView modelAndView = new ModelAndView("index")
//		
//		model.addAttribute("name",name);
//		return "index";
//	}
	
	@PostMapping("/display-name")
	public ModelAndView displayName(@RequestParam("name") String name) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("nahid");
		nameList.add("shuvo");
		nameList.add("piash");
		nameList.add("shams");
		nameList.add("anower");
		nameList.add("shohag");
		nameList.add("mamun");
		
		modelAndView.addObject("name",name);
		modelAndView.addObject("team",nameList);
		
		return modelAndView;
	}

	
}
