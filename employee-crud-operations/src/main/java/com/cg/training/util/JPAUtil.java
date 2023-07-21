package com.cg.training.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//Singleton design pattern
public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	private static EntityManager entityManager;
	private JPAUtil() {}
	//private constructor
	public static EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		if(entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

}
