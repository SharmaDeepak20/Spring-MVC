package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.model.Book;
import com.example.spring.repository.BookRepository;

@Service
public class BookRepositoryService {

	@Autowired
	private BookRepository br;
	
	public void addBook(Book b)
	{
		br.save(b);
	}//end addBook
	
}
