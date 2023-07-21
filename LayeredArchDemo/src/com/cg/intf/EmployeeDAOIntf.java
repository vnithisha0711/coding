package com.cg.intf;
import java.util.List;
import com.cg.entity.Employee;

public interface EmployeeDAOIntf {
	//String addEmployee(Employee employee);
	Employee[] getAllEmployees();
	Employee searchEmployee(int code);

}
