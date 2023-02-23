package com.example.springapp.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Model.Employee;
import com.example.springapp.Service.ApiService;

@RestController
public class ApiController {


	@Autowired
	ApiService empService;
	@PostMapping("/addDetails")
	public Employee addinfo(@RequestBody Employee st) {
		return empService.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<Employee> fetchDetails(){
		return empService.getDetails();
	}
	
	
	
	
}