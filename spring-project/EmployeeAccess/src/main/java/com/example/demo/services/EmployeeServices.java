package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeServices {
    List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee thEmployee);
	
	void deleteById(int theId);
}
