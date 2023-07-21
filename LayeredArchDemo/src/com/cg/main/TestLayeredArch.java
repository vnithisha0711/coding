package com.cg.main;

import com.cg.entity.Employee;
import com.cg.ui.service.EmployeeService;

public class TestLayeredArch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService service=new EmployeeService();
		
		Employee empArr[]=service.getAllEmployees();
		
		System.out.println("employee details");
		for(Employee emp: empArr) {
			System.out.println(emp);
		}

		Employee emp=service.searchEmployee(101);
		if(emp==null) {
			System.out.println("Employee not found");
		}
		else {
			System.out.println("Employee Found");
			System.out.println(emp);
		}
	}

}
