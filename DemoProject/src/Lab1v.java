import java.util.Scanner;

public class Lab1v {

	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a1=sc.nextInt();
		int result=calculateSum(a1);
		System.out.println(result);
	}

}
