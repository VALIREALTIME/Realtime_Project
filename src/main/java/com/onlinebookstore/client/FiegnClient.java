package com.onlinebookstore.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("HotelBooking")
public interface FiegnClient {

	@GetMapping("/hotel")
	public String greetings();

}
