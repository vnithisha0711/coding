package com.cg.service;
//import java.util.List;
import com.cg.entity.Employee;
import com.cg.intf.EmployeeDAOIntf;
public class EmployeeDAOIntfImpl implements EmployeeDAOIntf{

	Employee empArr[]= {
			new Employee(100,"Comp",35000),
			new Employee(101,"Mktg",40000),
			new Employee(102,"Purchase",50000)
	};
	int arr[]= {1,2,3,4};
	
	public Employee[] getAllEmployees(){
		return empArr;
	}

	public Employee searchEmployee(int code) {
		
		for(Employee e: empArr) {
			if(e.getEmpCode()==code) {
				return e;
			}
		}
		return null;
	}
	

}
