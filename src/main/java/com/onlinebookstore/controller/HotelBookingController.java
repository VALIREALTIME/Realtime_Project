package com.onlinebookstore.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class HotelBookingController {
	
	
	

	@GetMapping("/hotel")
	public String greetings() {
		return "Good Morning Everyone";

	}

}
