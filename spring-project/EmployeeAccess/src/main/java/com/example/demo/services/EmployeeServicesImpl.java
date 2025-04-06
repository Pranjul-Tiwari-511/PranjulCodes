package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

	private EmployeeDao employeeDao;
	
	 @Autowired
	 EmployeeServicesImpl(EmployeeDao thDao){
		 employeeDao=thDao;
	 }
	
	
	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public Employee findById(int theId) {
		
		return employeeDao.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee thEmployee) {
		return employeeDao.save(thEmployee);
	}

	@Transactional
	@Override
	public void deleteById(int theId) {
		 employeeDao.deleteById(theId);
	}

}
