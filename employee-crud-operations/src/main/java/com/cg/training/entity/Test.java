package com.cg.training.entity;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		List<Employee> employees=new ArrayList<>();
		//auto boxing and unboxing
		list.add(123); //int/Integer==wrappper class
		list.add(new Employee("Nithisha","Mumbai",54000));
	}

}
