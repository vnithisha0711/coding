package com.cg.training.dao.service;

import java.util.List;

import com.cg.training.entity.Employee;

public interface EmployeeService {
	boolean saveEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean removeEmployee(Employee employee);
	Employee getById(int id);
	
	List<Employee> getAllEmployees();

	Long getEmployeeCount();
	
	List<Employee> getEmployeeByName(String name);
}
