package com.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.client.FiegnClient;

@RestController
public class FlightController {

	@Autowired
	private FiegnClient fiegnClient;

	@GetMapping("/flights")
	public String getFlights() {
		String greet = fiegnClient.greetings();
		return "Welcome to the Airlines" + greet;

	}

}
