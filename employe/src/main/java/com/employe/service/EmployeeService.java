package com.employe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.entity.Employee;
import com.employe.exception.IncorrectIdException;
import com.employe.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	@Autowired
	EmployeeRepositoryInterface employeeRepositoryInterface;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findAll();
	}

	@Override
	public List<Employee> findBySalary(int salary) {
		// TODO Auto-generated method stub
		return employeeRepositoryInterface.findBySalary(salary);
	}

	@Override
	public Employee findById(long id) {
		if(employeeRepositoryInterface.existsById(id)) {
			return employeeRepositoryInterface.getById(id);			
		}else {
			throw new IncorrectIdException();
		}
	}
}
