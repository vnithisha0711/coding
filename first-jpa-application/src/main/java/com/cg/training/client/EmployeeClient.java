package com.cg.training.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.training.entity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=factory.createEntityManager();
		entityManager.getTransaction().begin();
		//here we will persist our object
		
		Employee employee=new Employee("Leena","Banglore",55000);//new state
		entityManager.persist(employee);

		entityManager.getTransaction().commit();
		System.out.println("the employee information stored successfully");
	}

}
