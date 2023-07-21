package com.cg.Lab5i;

import java.util.Scanner;

public class Person {
	
	public static void checkAge(int n) throws InvalidException{
		
		//try {
			if(n<15) {
				throw new InvalidException();
			}
			/*else {
				System.out.println("entered age is invalid");
			}*/
		//}
		/*catch(InvalidException ei) {
			System.out.println(ei);
		}*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the age of a person:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		try {
			checkAge(n);
		}
		catch(InvalidException ni) {
			System.out.println(ni);
		}

		//System.out.println("Program Over");
	}

}
