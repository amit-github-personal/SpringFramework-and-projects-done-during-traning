package com.javatpoint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerDemo {
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/check")
	public String hello(/*HttpServletRequest request*/@RequestParam("user") String user, @RequestParam("pass") String pass, Model md)
	{
		/*String user=request.getParameter("user");
		String pass=request.getParameter("pass");*/
		
		if(user.equals("admin") && pass.equals("admin@123"))
		{
			String msg= "Welcome Mr. "+ user;
			md.addAttribute("Message", msg);
			return "view";
		}
		else
		{
			String msg= "Sorry you have entered wrong username or password";
			md.addAttribute("Message", msg);
			return "error";
		}
	}

}
