package com.cg.collection;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedObjStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Employee> empList=new ArrayList<>();
		
		empList.add(new Employee(100,"renuka","comp",65000.0));
		empList.add(new Employee(101,"radhika","comp",85000.0));
		empList.add(new Employee(100,"ishan","testing",445000.0));
		
		System.out.println("total employees: "+empList.stream().count());
		System.out.println("employees with salary >= 50000");
		empList.stream().filter((eob)->eob.getSalary()>=50000).forEach((eob)->System.out.println(eob));;
		empList.stream().map((eob)->eob.getName().toUpperCase()).forEach((eob)->System.out.println(eob));
	}

}
