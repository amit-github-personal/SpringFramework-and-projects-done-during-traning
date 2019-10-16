package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Controllerdemo {
	
	@RequestMapping("/hello")
	public String view()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "user";
	}
}
