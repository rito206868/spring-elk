package com.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoProjApplication {
	
	private static final org.slf4j.Logger Logger =
            org.slf4j.LoggerFactory.getLogger(DemoProjApplication.class);
	
	@RequestMapping("/hello")
	public String hello(){
		
		Logger.info("Inside Hello");
		Logger.debug("Complete App");
		return "Hello Spring 2019";
		
	}

	//Main method to initiate the prog
	public static void main(String[] args) {
		Logger.info("Starting Springboot Application");
		SpringApplication.run(DemoProjApplication.class, args);
	}
	

}
