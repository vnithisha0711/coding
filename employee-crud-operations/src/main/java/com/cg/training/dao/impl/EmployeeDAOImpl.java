package com.cg.training.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.training.dao.EmployeeDAO;
import com.cg.training.entity.Employee;
import com.cg.training.util.JPAUtil;

public class EmployeeDAOImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	
	public EmployeeDAOImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.merge(employee);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.remove(employee);
		entityManager.getTransaction().commit();
		return true;
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		Employee employee=entityManager.find(Employee.class, id);
		entityManager.getTransaction().commit();
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String jpql="SELECT employee FROM Employee employee ";
		Query query=entityManager.createQuery(jpql);
		List list=query.getResultList();
		return list;
	}

	@Override
	public Long employeeCount() {
		// TODO Auto-generated method stub
		String jpql="select COUNT(employee.employeeId) FROM Employee employee ";
		TypedQuery<Long> count=entityManager.createQuery(jpql, Long.class);
		Long result=count.getSingleResult();
		return result;
	}
	
	@Override
	public List<Employee> getByName(String name) {
		// TODO Auto-generated method stub
		String jpql="SELECT employee FROM Employee employee WHERE employee.name=:name";
		TypedQuery<Employee> query=entityManager.createQuery(jpql, Employee.class);
		query.setParameter("name", name);
		List<Employee> list=query.getResultList();
		return list;
	}

}
