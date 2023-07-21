package com.cg.eis.bean;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String desgn;
	private String insuranceScheme;
	
	public Employee() {}

	public Employee(int empId, String empName, double empSalary, String desgn, String insuranceScheme) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.desgn = desgn;
		this.insuranceScheme = insuranceScheme;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getDesgn() {
		return desgn;
	}

	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	

}
