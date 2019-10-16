package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.User;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/login")
	public String view(Model md)
	{
		md.addAttribute("bean", new User());
		return "login";
	}
	
	@RequestMapping("/signin")
	public String signin(@ModelAttribute("bean") User u)
	{
		if(u.getUser().equals("admin") && u.getPass().equals("admin@123"))
		{
			return "success";
		}
		else
		{
			return "failed";
		}
	}
}
