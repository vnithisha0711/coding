import java.util.Scanner;

public class Lab3vi {
	public static boolean postring(String str) {
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length-1;i++) {
			int a=(int)arr[i];
			int b=(int)arr[i+1];
			if(a>b) {
				return false;
			}
		}return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println(postring(str));

	}

}
