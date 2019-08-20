package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.WebUser;

@Configuration
public class AppConfig {

	@Bean
	public WebUser ramesh()
	{
		return new WebUser("Ramesh","India");

	}
	@Bean
	public WebUser ram()
	{
		return new WebUser("Ram","Italy");

	}
	@Bean
	public WebUser sanjay()
	{
		return new WebUser("Sanjay","SanFrancisco");

	}
	@Bean
	public WebUser vishnu()
	{
		return new WebUser("Vishnu","Chennai");

	}
	@Bean
	public WebUser ravi()
	{
		return new WebUser("Ravi","Porur");

	}
}
