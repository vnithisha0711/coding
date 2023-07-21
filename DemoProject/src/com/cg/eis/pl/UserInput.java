package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeServiceImpt;

public class UserInput extends EmployeeServiceImpt{
	public static void main(String[] args) {
		EmployeeServiceImpt obj=new EmployeeServiceImpt();
		int id;
		String name;
		double salary;
		
		Scanner s=new Scanner(System.in);
		id=s.nextInt();
		name=s.next();
		salary=s.nextDouble();
		
		obj.empDetails(id,name,salary);
		
		System.out.println(obj.getDesgn);
		System.out.println(obj.getinsuranceScheme);
		System.out.println(obj.getempName()+" "+obj.getempSalary()+" "+obj.getempId());
		s.close();
	}

}
