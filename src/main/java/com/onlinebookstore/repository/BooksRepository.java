package com.onlinebookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinebookstore.entity.Book;

@Repository  //it is optoinal
public interface BooksRepository extends CrudRepository<Book, Integer> {

}
