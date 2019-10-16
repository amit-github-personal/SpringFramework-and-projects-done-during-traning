package com.springtag.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtag.Bean.User;

@Controller
@RequestMapping("/user")
public class Controller1 {
	
	@RequestMapping("/login")
	public String login(Model md)
	{
		md.addAttribute("bean", new User());
		return "login";
	}
	
	@RequestMapping("/validate")
	public String check(@ModelAttribute("bean") User u, Model md)
	{
		if(u.getUsername().equals("admin") && u.getPassword().equals("admin@123"))
		{
			if(u.getGender().equals("Male"))
			{
				md.addAttribute("gender", "Welcome Mr. "+u.getUsername());
			}
			else
			{
				md.addAttribute("gender", "Welcome Mrs. "+u.getUsername());
			}
			
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	

}
