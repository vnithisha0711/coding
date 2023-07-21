package com.cg.Lab5ii;

import java.util.Scanner;

public class Employee {
	public static void Employee(String fname,String lname) throws InvalidException{
		//try {
			if(fname==null || lname==null) {
			
				throw new InvalidException();
			}

			System.out.println("full name="+fname+" "+lname);
	}
		//catch{
			
		//}
	//}
	public static void main(String[] args) {
		System.out.println("enter the first and last name");
		Scanner sc=new Scanner(System.in);
		String fname=sc.next();
		String lname=sc.next();
		System.out.println("first"+ fname+"\n");
		System.out.println("last"+ lname+"\n");
		
		try {
			Employee(fname,lname);
		}
		catch(InvalidException ui) {
			System.out.println(ui);
		}
	}

}
