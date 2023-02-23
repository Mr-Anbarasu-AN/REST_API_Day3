package com.example.springapp.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Model.Employee;
import com.example.springapp.Repository.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo stRepo;
	
	public Employee saveDetails(Employee e)
	{
		return stRepo.save(e);
	}
	
	public List<Employee> getDetails(){
		return stRepo.findAll();
	}
}