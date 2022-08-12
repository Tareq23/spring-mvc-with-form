
package com.tareq23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tareq23.model.User;

@Controller
public class UserController
{
	@PostMapping("display-user-info")
	public ModelAndView displayUserInfo(@ModelAttribute User user)
	{
		ModelAndView modelAndView = new ModelAndView("display_user_info");
//		System.out.println(user);
		modelAndView.addObject("user",user);
		return modelAndView;
	}
}