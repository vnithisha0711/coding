import java.util.Scanner;

public class Lab1vi {
	
	public static int calculateDifference(int n) {
		int sum=0,a=0,b=0;
		for(int i=0;i<=n;i++) {
			a=(n*(n+1)*(2*n+1))/6;
			b=(n*(n+1)/2);
			b=b*b;
			n=(n*(n+1)*(2*n+1))/6;
			sum=Math.abs(a-b);
		}return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a1=sc.nextInt();
		int result=calculateDifference(a1);
		System.out.println(result);
	}

}
