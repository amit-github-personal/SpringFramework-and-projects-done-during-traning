package com.springtag.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtag.Bean.User;

@Controller
@RequestMapping("/admin")
public class adminController {
	
	@RequestMapping("/login")
	public String login()
	{
		return "adlogin";
	}
	@RequestMapping("/validate")
	public String check(@ModelAttribute("bean") User u, Model md)
	{
		if(u.getUsername().equals("admin") && u.getPassword().equals("admin@123"))
		{
			
			
			return "success";
		}
		else
		{
			return "fail";
		}
	}

}
