package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringDataAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringDataAppApplication.class, args);
		System.out.println("Application is running");
	}
}
