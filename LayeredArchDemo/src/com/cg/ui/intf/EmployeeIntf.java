package com.cg.ui.intf;

import com.cg.entity.Employee;

public interface EmployeeIntf {
	Employee[] getAllEmployees();

	Employee searchEmployee(int code);
}
