package com.cg.training.dao.serviceimpl;

import java.util.List;

import com.cg.training.dao.EmployeeDAO;
import com.cg.training.dao.impl.EmployeeDAOImpl;
import com.cg.training.dao.service.EmployeeService;
import com.cg.training.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO dao;
	public EmployeeServiceImpl() {
		dao=new EmployeeDAOImpl();
	}
	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.saveEmployee(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.updateEmployee(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.removeEmployee(employee);
		return true;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}
	@Override
	public Long getEmployeeCount() {
		// TODO Auto-generated method stub
		
		return dao.employeeCount();
	}
	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		
		return dao.getByName(name);
	}
	

}
