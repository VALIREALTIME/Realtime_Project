package com.nareshit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AwsController {

	@GetMapping("/")
	public String getMethodName() {
		return "Aws Deployment Successfully";
	}
	
	
	
	
}
