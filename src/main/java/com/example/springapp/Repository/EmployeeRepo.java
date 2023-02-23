package com.example.springapp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}