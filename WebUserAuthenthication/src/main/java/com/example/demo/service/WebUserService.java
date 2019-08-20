package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.WebUser;

@Service
public class WebUserService {

	@Autowired
	List<WebUser> webuserlist;
	

	public String findUser(String uName, String password) {
		
		
		System.out.println(uName);
		WebUser user=this.webuserlist.stream().filter(obj ->obj.getUserName().equals(uName)&&obj.getPassword().equals(password)).findFirst().orElse(null);
		String message="Valid User";
		if(user==null)
		{
			message="invalid user";
		}
		System.out.println(message);
		return message;
	}
	
	
	public List<WebUser> find()
	{
		return this.webuserlist;
	}


	public WebUser add(WebUser user) {
		
		//System.out.println(user.getUserName());
		 this.webuserlist.add(user);
		 return user;
	}
}



