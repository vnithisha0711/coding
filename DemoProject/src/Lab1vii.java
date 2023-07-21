import java.util.Scanner;

public class Lab1vii {
	
	public static boolean checkNumber(int n) {
		String s=n+"";
		int length=s.length();
		for(int i=0;i<length-1;i++) {
			if(s.charAt(i)<=s.charAt(i+1)) {
				continue;
			}else return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a1=sc.nextInt();
		boolean flag=checkNumber(a1);
		System.out.println(flag);
	}
	
	
}
