package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Employee;

@Controller
public class MvcController {

	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public ModelAndView employee()
	{
		return new ModelAndView("emp","command",new Employee());
	}
	
	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	public ModelAndView addEmployee(Employee emp, ModelAndView model)
	{
		model.addObject("eId",emp.geteId());
		model.addObject("name",emp.getName());
		model.addObject("dept",emp.getDept());
		model.setViewName("empInfo");
		return model;
	}
	
	@RequestMapping(value="/addemp1",method=RequestMethod.POST)
	public ModelAndView addEmployee1(@ModelAttribute("emp") Employee emp, ModelMap map)
	{
		map.addAttribute("emp");
		
		return new ModelAndView("empInfo1");
	}
}
