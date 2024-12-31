package com.onlinebookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.entity.Book;
import com.onlinebookstore.service.BooksService;

@RestController
public class RegistrationController {
	
	@Autowired
	private BooksService booksService;
	
	@PostMapping("/register")
	public ResponseEntity<Book>  createReg(@RequestBody Book book){
		Book registartion = booksService.createRegistartion(book);
		return new ResponseEntity<>(registartion,HttpStatus.OK);
		
		
	}
	
	
}
