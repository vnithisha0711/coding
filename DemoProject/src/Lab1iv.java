import java.util.Scanner;

public class Lab1iv {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		b=sc.nextInt();
		System.out.println("prime numbers upto:");
		for(int i=2;i<b;i++) {
			a=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					a=1;
			}
			if(a==0) {
				System.out.println(i);
			}
		}

	}

}
