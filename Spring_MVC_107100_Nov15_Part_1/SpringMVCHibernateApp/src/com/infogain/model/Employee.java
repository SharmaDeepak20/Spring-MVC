package com.infogain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Spring_Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	private int empId;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="empaddress")
	private String empAddress;
	
	@Column(name="empsalary")
	private Long salary;
	
	@Column(name="empage")
	private int empAge;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empAddress, Long salary, int empAge) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.salary = salary;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", salary=" + salary
				+ ", empAge=" + empAge + "]";
	}	
}
