package com.employe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employe.entity.Employee;

public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Long> {
	List<Employee> findBySalary(int salary);
}
