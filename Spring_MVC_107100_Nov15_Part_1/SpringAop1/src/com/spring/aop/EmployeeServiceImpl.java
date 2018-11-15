package com.spring.aop;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void getEmployeebyName(int id, String name) {
		System.out.println("Inside getEmployeebyName...");
		System.out.println("Eid: "+id+" , Name: "+name);
	}

	@Override
	public void addEmployee() {
		System.out.println("Inside addEmployee...");
		
	}

}
