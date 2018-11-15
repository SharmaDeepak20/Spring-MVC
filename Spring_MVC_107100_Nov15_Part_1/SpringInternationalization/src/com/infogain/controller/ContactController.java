package com.infogain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infogain.bean.Contact;

@Controller
public class ContactController {

	@RequestMapping(value="/contacts")
	public ModelAndView getContact()
	{
		return new ModelAndView("contact","command",new Contact());
	}//end getContact
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact)
	{
		return "disp";
	}//end addContact
}
