package com.cg.training.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.training.dao.EmployeeDAO;
import com.cg.training.dao.impl.EmployeeDAOImpl;
import com.cg.training.dao.service.EmployeeService;
import com.cg.training.dao.serviceimpl.EmployeeServiceImpl;
import com.cg.training.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		EmployeeService service=new EmployeeServiceImpl();
		
		//EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		//EntityManager entityManager=factory.createEntityManager();
		//entityManager.getTransaction().begin();
		//here we will persist our object
		
		//Employee employee=new Employee("Leena","Banglore",55000);//new state
		//entityManager.persist(employee);

		//Employee employee=service.getById(4);
		
		//employee.setSalary(employee.getSalary()+employee.getSalary()*10/100);
		//entityManager.getTransaction().commit();
		
		//List<Employee> employees=service.getAllEmployees();
		//employees.forEach(System.out::println);
       // Long count = service.getEmployeeCount();
        //System.out.println("total employee count is " + count);
	    List<Employee> list=service.getEmployeeByName("Leena");
	    list.forEach(System.out::println);
	}

}
