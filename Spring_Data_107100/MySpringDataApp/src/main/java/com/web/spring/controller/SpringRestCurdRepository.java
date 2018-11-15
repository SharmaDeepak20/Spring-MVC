package com.web.spring.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring.model.Book;
import com.web.spring.service.BookCurdRepositoryService;

@RestController
public class SpringRestCurdRepository {

	@Autowired(required=true)
	BookCurdRepositoryService bcrs;
	@RequestMapping(value="my")
	public String greet()
	{
		return "Welcome Sir Deepak Sharma";
	}//end greet
	
	@RequestMapping(value="/addBook", method=RequestMethod.POST)
	public String addBook(@RequestParam int id,@RequestParam String name,@RequestParam String author, @RequestParam int price)
	{
	   Book b=new Book(id, name, author, price);
	   bcrs.addBook(b);
	   
	   return "book added";
	}//end addBook
}
