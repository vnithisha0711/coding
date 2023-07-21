package com.cg.training.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.cg.training.dao.EmployeeDAO;
import com.cg.training.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.cg.training"); //give base package name
		context.refresh();

		EmployeeDAO dao=context.getBean(EmployeeDAO.class);
		
		Employee employee=new Employee("admin@capgemini.com", "admin@123", "Super Admin", 25, 987657553L, "4 years", "IT", "Pune", 34000);
		dao.registerEmployee(employee);
		context.close();
	}

}
