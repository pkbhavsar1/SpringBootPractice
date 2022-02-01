package com.employe.service;

import java.util.List;

import com.employe.entity.Employee;

public interface EmployeeServiceInterface {
	public List<Employee> findAll();

	public List<Employee> findBySalary(int salary);

	public Employee findById(long id);
}
