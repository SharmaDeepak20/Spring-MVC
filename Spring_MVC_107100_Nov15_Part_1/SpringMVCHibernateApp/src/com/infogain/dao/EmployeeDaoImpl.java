package com.infogain.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infogain.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addEmployee(Employee emp) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(emp);
		t.commit();
		session.close();
		
		System.out.println("Employee Added...");
	}

	@Override
	public List<Employee> listEmployees() {
		List<Employee> listEmp=new ArrayList<Employee>();
		
		String query="from Employee";
		
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		listEmp=session.createQuery(query).list();
		t.commit();
		session.close();
		return listEmp;
	}

}
