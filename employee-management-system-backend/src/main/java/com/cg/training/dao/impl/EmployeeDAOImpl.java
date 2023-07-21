package com.cg.training.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.training.dao.EmployeeDAO;
import com.cg.training.entity.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean registerEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {

		sessionFactory.getCurrentSession().update(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(Employee employee) {

		sessionFactory.getCurrentSession().delete(employee);
		return true;
	}

	@Override
	public Employee getEmployeeById(int id) {

		Employee employee=sessionFactory.getCurrentSession().get(Employee.class, id);
		return employee;

	}

	@Override
	public List<Employee> getAllEmployees() {

		Query query=sessionFactory.getCurrentSession().createQuery("FROM Employee");
		List list=query.list();
		return list;
	}
	

}
