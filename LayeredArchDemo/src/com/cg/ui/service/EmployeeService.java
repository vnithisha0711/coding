package com.cg.ui.service;

import com.cg.entity.Employee;

import com.cg.service.EmployeeDAOIntfImpl;
import com.cg.ui.intf.EmployeeIntf;

public class EmployeeService implements EmployeeIntf {
	private EmployeeDAOIntfImpl edi;
	
	public EmployeeService(){
		edi=new EmployeeDAOIntfImpl();
	}
	public Employee[] getAllEmployees() {
		return edi.getAllEmployees();
	}

	public Employee searchEmployee(int code) {
		return edi.searchEmployee(code);
	}
}
