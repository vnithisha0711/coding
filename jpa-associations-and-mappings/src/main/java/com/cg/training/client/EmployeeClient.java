package com.cg.training.client;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.cg.training.entity.Account;
import com.cg.training.entity.Category;
import com.cg.training.entity.Developer;
import com.cg.training.entity.Employee;
import com.cg.training.entity.Product;
import com.cg.training.entity.Technology;
import com.cg.training.util.JPAUtil;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager=JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
	//	Employee employee=new Employee("Preeti","Bangalore",53000);
		
//		Account account=new Account("Saving",10000,10000000,"SBI");
//		employee.setAccount(account);
//		entityManager.persist(employee);
//		Product product=new Product("OnePlus Nord","with 12GB RAM and 256 GB ROM",40000);
//		Product product1=new Product("Think Pad","Lenovo Thinkpad with 16GB RAM &1TB ROM",85000);
		
		
//		Category category=new Category();
//		category.setName("Electronics");
//		category.setDescription("These are elctronics products");
		
//		Set<Product> products=new HashSet<>();
//		product.setCategory(category);
//		product1.setCategory(category);
//		products.add(product);
//		products.add(product1);
	
//		category.setProducts(products);
	
//		entityManager.persist(category);
//		entityManager.persist(product); //save into database
		
		
		
		//Many To Many Relationship
		Developer developer1=new Developer();
		developer1.setName("Marya");
		
		Developer developer2=new Developer();
		developer2.setName("Meena");
		
		Developer developer3=new Developer();
		developer3.setName("Rohit");
		
		Technology technology1=new Technology();
		technology1.setLanguage("Java");
		technology1.setExperience("5 years");
		
		Technology technology2=new Technology();
		technology2.setLanguage("Java FSE");
		technology2.setExperience("8 years");
		
		Set<Technology> technologies=new HashSet<>();
		technologies.add(technology1);
		technologies.add(technology2);
		
		developer1.setTechnologies(technologies);
		developer2.setTechnologies(technologies);
		developer3.setTechnologies(technologies);
		
		entityManager.persist(developer1);
		entityManager.persist(developer2);
		entityManager.persist(developer3);
	
		entityManager.getTransaction().commit();
	    entityManager.close();
	
	}

}
