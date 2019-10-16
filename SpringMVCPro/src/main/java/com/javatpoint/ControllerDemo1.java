package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerDemo1 {
	
	@RequestMapping("/hello")
	public String view()
	{
		return "hello";
	}
	


}
