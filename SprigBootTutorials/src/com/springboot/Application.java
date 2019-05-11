package com.springboot;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
@PropertySource("classpath:app.properties")
public class Application {
	public static void main(String args[])
	{	
		System.setProperty("server.servlet.context-path", "/testpath");
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value="/callme")
	
	public String hello() 
	{
		System.out.print("hello method");
		
		return "Hello there!!!";
	}
}
