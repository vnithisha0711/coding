package com.cg.eis.exception;

import java.util.Scanner;

public class Except {
	public static void Except(int salary) throws EmployeeException {
		
		if(salary<3000) {
			throw new EmployeeException();
		}
		System.out.println("salary is:" +salary);
		
	}

	public static void main(String[] args) {
		System.out.println("enter the salary of employee:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		
		try {
			Except(s);
		}
		catch(EmployeeException ti) {
			System.out.println(ti);
		}
		
	}
}
