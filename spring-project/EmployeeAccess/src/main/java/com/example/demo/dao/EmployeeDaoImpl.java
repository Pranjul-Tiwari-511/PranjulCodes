package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDaoImpl(EntityManager thEntityManager) {
	  
		entityManager=thEntityManager;
	}

	@Override
	public List<Employee> findAll() {
		
		TypedQuery<Employee> list= entityManager.createQuery("from Employee",Employee.class);
		
		List<Employee> theEmployees= list.getResultList();
		return theEmployees;
	}

	@Override
	public Employee findById(int theId) {
		
		Employee employee= entityManager.find(Employee.class, theId);
		
		return employee;
	}

	@Override
	public Employee save(Employee thEmployee) {
		
		Employee employee= entityManager.merge(thEmployee);
		
		return employee;
	}

	@Override
	public void deleteById(int theId) {

      Employee employee= entityManager.find(Employee.class,theId);
      
      entityManager.remove(employee);
		
	}

}
