package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeServices;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employees")
public class EmployeeRestController {

	private EmployeeServices employeeServices;
	
	public EmployeeRestController(EmployeeServices thEmployeeServices) {
		employeeServices=thEmployeeServices;
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		return "employees/login";
	}
	
//	@PostMapping("/loginDetails")
//	public String loginDetails(Model model, HttpServletRequest request) {
//	
//		String name= request.getParameter("username");
//		
//		String password= request.getParameter("password");
//		
//		model.addAttribute("username", name);
//		
//		model.addAttribute("password", password);
//		
//		List<Employee> list=  employeeServices.findAll();
//		
//		if(name.equalsIgnoreCase("test123") && password.equalsIgnoreCase("root")) {
//			model.addAttribute("employees", list);
//			return "employees/list-employees";
//		}
//		else {
//			return "employees/login";
//		}
//		
//		
//	}
	
	
	 @GetMapping("/list")
	 public String listEmployees(Model model) {
		 
		 List<Employee> list= employeeServices.findAll();
		 
		model.addAttribute("employees", list);
		
		return "employees/list-employees";
		 
	 }
	 
	 
	 @GetMapping("/showFormForAdd")
	 public String showFormForAdd(Model model) {
		 
		 Employee thEmployee = new Employee();
		 
		 model.addAttribute("employee", thEmployee);
		
		return "employees/add-employee";
		 
	 }
	 
	 
	 @GetMapping("/showFormForUpdate")
	 public String showFormForUpdate(@RequestParam("employeeId") int theId, Model model) {
		 
		 Employee employee= employeeServices.findById(theId);
		 
		 model.addAttribute("employee", employee);
		
		 return "employees/add-employee";
		 
	 }
	 
	 
	 
	 @PostMapping("/save")
	 public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		 
		 employeeServices.save(theEmployee);
		 
		 return "redirect:/employees/list";
		 
	 }
	
	
	
	
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId")int  theId ) {
		
		employeeServices.deleteById(theId);
		
		 return "redirect:/employees/list";
		
	}
	
}
