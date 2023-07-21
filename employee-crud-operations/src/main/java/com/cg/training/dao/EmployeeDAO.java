package com.cg.training.dao;

import java.util.List;

import com.cg.training.entity.Employee;

public interface EmployeeDAO {
	boolean saveEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean removeEmployee(Employee employee);
	Employee getById(int id);
	
	List<Employee> findAll();
	
	Long employeeCount();
	
	List<Employee> getByName(String name);
}
