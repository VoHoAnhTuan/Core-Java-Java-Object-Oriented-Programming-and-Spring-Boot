package com.oops.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employer;
	private Short employeeGrade;
	private BigDecimal salary;
	
	
	
	
	public Employee(String name, String title, String employer, Short employeeGrade, BigDecimal salary) {
		super(name);
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getEmployer() {
		return employer;
	}


	public void setEmployer(String employer) {
		this.employer = employer;
	}


	public Short getEmployeeGrade() {
		return employeeGrade;
	}


	public void setEmployeeGrade(Short employeeGrade) {
		this.employeeGrade = employeeGrade;
	}


	public  BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [title=" + title + ", employer=" + employer + ", employeeGrade=" + employeeGrade + ", salary="
				+ salary + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPhoneNumber()="
				+ getPhoneNumber() + "]";
	}
}
