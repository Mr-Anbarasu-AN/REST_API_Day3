package com.example.springapp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_TB")
public class Employee {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="employeeName")
	private String employeeName;
	
	@Column(name="employeeAge")
	private int employeeAge;
	
	@Column(name="salary")
	private long salary;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getemployeeName() {
		return employeeName;
	}
	
	public int getemployeeAge() {
		return employeeAge;
	}
	public void setemployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	public long getsalary() {
		return salary;
	}
	public void setsalary(long salary) {
		this.salary = salary;
	}
}