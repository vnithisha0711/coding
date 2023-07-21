import java.util.Scanner;

public class Lab1viii {

	public static boolean checkNumber(int n) {
		if(n%2!=0||n==0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a1=sc.nextInt();
		boolean flag=checkNumber(a1);
		System.out.println(flag);
	}

}
