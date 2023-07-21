package com.cg.exception;

public class ExceptionDemo {

	public static void checkNumber(int n) throws Exception {
		if(n<=0) {
			throw new Exception();
			//throw new IllegalArgumentException();//generating and throwing exception takes places if not handled it calls form and goes to 40 line for delegation
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int n = 0,n1=12,n2=2;
		//int arr[]= {1,2,3,4};
		
		int n=-12;
		
		/*try {
			
		    System.out.println(n1/n2);
		    //arr[5]=100;//ArrayIndexOutofBoundsException
		}
		catch(ArithmeticException ae) {
		    System.out.println("Divided by zero");
		}
		finally {
			
			System.out.println("Finally 1");
		}
		
		try {
			arr[3]=100;
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}*/
		
		try {
			checkNumber(n);//delegated if not goes to java run time exception
		
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(Exception ie) {
			System.out.println(ie);
		}
		/*catch(ArithmeticException ae) {
			System.out.println(ae);//error
		}*/
		System.out.println("Program Over");//abrupt termination

	}

}
