package com.onlinebookstore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstore.entity.Book;
import com.onlinebookstore.repository.BooksRepository;
import com.onlinebookstore.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService{

	@Autowired BooksRepository booksRepository;
	
	@Override
	public Book createRegistartion(Book book) {
		 Book save = booksRepository.save(book);
		 return save;
	}
	
	
	
	
	
	
	
	
	

}
