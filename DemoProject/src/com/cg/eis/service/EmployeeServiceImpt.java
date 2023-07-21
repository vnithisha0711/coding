package com.cg.eis.service;

public class EmployeeServiceImpt extends Employee implements EmployeeService {
	
	public EmployeeServiceImpt() {}
	
	public void empDetails(int id,String name,double salary) {
		super(id,name,salary);
		findScheme();
	}

}
