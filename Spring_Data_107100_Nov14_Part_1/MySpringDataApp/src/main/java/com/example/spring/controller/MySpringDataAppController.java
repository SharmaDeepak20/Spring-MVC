package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Book;
import com.example.spring.service.BookRepositoryService;

@RestController
public class MySpringDataAppController {

	@Autowired
	private BookRepositoryService brs;
	
	@RequestMapping("my")
	public String greet()
	{
		return "Welcome to FedEx";
	}//end greet
	
	@RequestMapping("addBook")
	public String addBook(@RequestParam int id,@RequestParam String name,@RequestParam String author,@RequestParam int price)
	{
		Book b=new Book(id, name, author, price);
	    brs.addBook(b);	
		return "Book is added";
	}//end addBook
}
