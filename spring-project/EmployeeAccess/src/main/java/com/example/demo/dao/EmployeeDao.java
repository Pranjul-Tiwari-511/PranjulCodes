package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	Employee save(Employee thEmployee);
	
	void deleteById(int theId);
}
