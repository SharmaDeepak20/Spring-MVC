package com.example.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringController {

	@RequestMapping(value="/my")
	public String greet()
	{
		return "Welcome Spring Boot";
	}//end greet
}
