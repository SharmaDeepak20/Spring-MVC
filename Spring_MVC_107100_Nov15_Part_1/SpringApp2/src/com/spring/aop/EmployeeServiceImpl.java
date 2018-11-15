package com.spring.aop;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void getEmployeebyName(String name) {
		System.out.println("Inside getEmployeebyName");	
		if(name==null)
		{
			throw new NullPointerException();
		}
		else
		{
			System.out.println("Employee is "+name);
		}
	}

}
