package com.employe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employe.entity.Employee;
import com.employe.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@GetMapping
	public List<Employee> findAll() {
		return employeeServiceInterface.findAll();
	}
	
	@GetMapping("/employee/{salary}")
	public List<Employee> findBySalary(@PathVariable int salary){
		return employeeServiceInterface.findBySalary(salary);
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable long id) {
		return employeeServiceInterface.findById(id);
	}
	
	
}
