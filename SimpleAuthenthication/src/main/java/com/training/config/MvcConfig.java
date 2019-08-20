package com.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.training.models.User;




@Configuration
@EnableWebMvc     //Configuration Meta data
@ComponentScan(basePackages="com.training.controllers")
public class MvcConfig implements WebMvcConfigurer {
	
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);   // For using tag library
		return resolver;
	}
	@Bean
	public User user ()
	{
		return new User();
	}
	
    @Bean
	public ModelAndView mdlview()
	{
		return new ModelAndView();
	}

}
