import java.util.Scanner;

public class Lab1i {
public static void Cube(int num) {
		int sum=0,n=0;
		while(num!=0) {
			n=num % 10;
			sum=sum+n*n*n;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number \n");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    Cube(num);		
	}

	
}
