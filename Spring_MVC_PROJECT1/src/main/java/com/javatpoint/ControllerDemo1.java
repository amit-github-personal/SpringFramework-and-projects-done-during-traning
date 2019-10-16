package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ControllerDemo1 {
	
	
	
	@RequestMapping("/login")
	public String req()
	{
		return "admin";
	}

}
