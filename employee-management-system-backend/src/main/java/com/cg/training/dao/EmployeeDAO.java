package com.cg.training.dao;

import java.util.List;

import com.cg.training.entity.Employee;

public interface EmployeeDAO {
	
	public boolean registerEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean removeEmployee(Employee employee);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();

	
}
