package com.cg.entity;

public class Employee {
	protected int empCode;
	protected String dept;
	protected double salary;
	
	public Employee() {}
	
	public Employee(int empCode, String dept, double salary) {
		super();
		this.empCode = empCode;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
