package com.web.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table
@XmlRootElement
public class Book {

	int bookId;
	String name;
	String author;
	int Price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String name, String author, int price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		Price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", Price=" + Price + "]";
	}
}
