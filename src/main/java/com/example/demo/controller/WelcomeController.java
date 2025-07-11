package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getMethodName() {
		
		return "Welcome To Springboot Actuator";
	}
	
	@GetMapping("/greet")
	public String getMethod() {
		
		return "Good Morining Everyone.......";
	}
	
	
	
	
	
}
