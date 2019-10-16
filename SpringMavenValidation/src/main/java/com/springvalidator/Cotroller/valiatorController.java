package com.springvalidator.Cotroller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springvalidator.Model.User;

@Controller
public class valiatorController {
	
	@RequestMapping("/login")
	public String login()
	{		
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(Model md)
	{
		md.addAttribute("bean", new User());
		return "register";
	}
	
	@RequestMapping("/store")
	public String store(@Valid @ModelAttribute("bean") User u, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "register";
		}
		else
		{
			return "display";
		}
	}
	
	@RequestMapping("/loginu")
	public String login(@Valid @ModelAttribute("bean") User u, BindingResult br)
	{
		if(br.hasErrors())
		{
			
			//md.addAttribute("message", "Incorrect Username or password");
			return "login";
		}
		else
		{
			//md.addAttribute("message", "Successfully Logged in"+u.getUser()+" :<br/>"+u.getPassword()+" ");
			return "display";
		}
	}
	

}
