package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
