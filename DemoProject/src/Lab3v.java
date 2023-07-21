import java.util.Scanner;

public class Lab3v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the sentence here:");
		String s=sc.nextLine();
		
		char arr[]=s.toCharArray();
		System.out.println("No. of characters " +arr.length);
		
		String arr1[]=s.split("\r\n|\r|\n");
		System.out.println("No. of words " +arr1.length);
		
		String arr2[]=s.split(" ");
		System.out.println("No.of Lines " +arr2.length);
		

	}

}
