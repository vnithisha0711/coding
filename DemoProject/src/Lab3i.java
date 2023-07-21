import java.util.Scanner;
import java.util.*;
public class Lab3i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers as strings");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("number is:"+n);
			sum=sum+n;
		}
		System.out.println("sum of the integers is:"+sum);
	}

}
