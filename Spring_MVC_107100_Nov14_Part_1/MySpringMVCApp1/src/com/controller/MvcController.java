package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcController {

	@RequestMapping("/myData")
	public ModelAndView myData()
	{
		return new ModelAndView("welcome","msg", "Welcome to Spring MVC Training");
	}//end myData
	
	
	@RequestMapping("/my2")
	public ModelAndView formDataRender(HttpServletRequest req, HttpServletResponse resp)
	{
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		ModelAndView model=new ModelAndView("welcome1");
		model.addObject("uname",uname);
		model.addObject("pass", pass);
		//return new ModelAndView("welcome", "msg", "Username="+uname+" and Password="+pass);
		return model;
	}//end formDataRender
	
	@RequestMapping("/my3")
	public ModelAndView formDataRender2(@RequestParam String uname, @RequestParam String pass)
	{
		
		ModelAndView model=new ModelAndView("welcome1");
		model.addObject("uname",uname);
		model.addObject("pass", pass);
		//return new ModelAndView("welcome", "msg", "Username="+uname+" and Password="+pass);
		return model;
	}//end formDataRender2
}
