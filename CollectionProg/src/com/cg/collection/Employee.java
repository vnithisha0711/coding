package com.cg.collection;

public class Employee {
	private int ecode;
	private String name;
	private String dept;
	private double salary;
	
	public Employee() {}
	
	public Employee(int ecode, String name, String dept, double salary) {
		super();
		this.ecode = ecode;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEcode() {
		return ecode;
	}

	public void setEcode(int ecode) {
		this.ecode = ecode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee [ecode=" + ecode + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	

}
