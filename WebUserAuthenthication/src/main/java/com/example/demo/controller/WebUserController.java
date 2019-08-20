package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.WebUser;
import com.example.demo.service.WebUserService;

@RestController
public class WebUserController {

	@Autowired
	private WebUserService service;
	
	@GetMapping("/find/{username}/{password}")
	public String verify(@PathVariable("username") String userName,@PathVariable("password") String password)
	{
		return this.service.findUser(userName,password);
	}
	
	@GetMapping("/finduser")
	public List<WebUser> find()
	{
		return this.service.find();
	}
	
	@PostMapping(value="/find",produces="application/json",consumes="application/json")
	public WebUser addUser(@RequestBody WebUser user)
	{
		//System.out.println(user.getUserName());
		return this.service.add(user);
	}
}
