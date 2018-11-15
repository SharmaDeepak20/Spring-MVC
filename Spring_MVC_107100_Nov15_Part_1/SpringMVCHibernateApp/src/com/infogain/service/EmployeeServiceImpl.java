package com.infogain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.dao.EmployeeDaoImpl;
import com.infogain.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDao;

	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
	}

	@Override
	public List<Employee> listEmployees() {
		return employeeDao.listEmployees();
	}

}
