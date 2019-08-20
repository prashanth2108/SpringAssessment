package com.training.controllers;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.training.models.User;

@Controller

public class UserController {

	@Autowired
	private User user;
	
	@Autowired
	private ModelAndView mdlview;
	
	
	private HashMap<String,String> map = new HashMap<String, String>();
	
	@GetMapping("/addUser")
	public ModelAndView initForm1()
	{
		mdlview.setViewName( "registration");
		mdlview.addObject("command", user);
		return mdlview;
	}
	
	
	@PostMapping("/addUser")
	public String onSubmit(@Valid @ModelAttribute("command")User user,BindingResult result)  
	{
		
		System.out.println(user.getUserName());
		map.put(user.getUserName(), user.getPassword());
		String nextPage="login";
		
		if(result.hasErrors())
		{
			System.out.println(user.getUserName());
			nextPage="failure";
		}
		System.out.println("No Error");
		return nextPage;
		
	}
	
	@PostMapping("/login")
	public String onlogin(@Valid @ModelAttribute("command")User user,BindingResult result)  
	{
	
		String nextPage="failure";;
		
		if(user.getUserName().equals("Prashanth")&&user.getPassword().equals("Prashanth"))
		{
			nextPage="success";
		}
		return nextPage;
	}
}
