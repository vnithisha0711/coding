import java.util.*;
import java.util.Scanner;

public class Lab2iii {

	public static void getSorted(int a[],int n) {
		int[] arr1=new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			
			arr1[j-1]=a[i];
			j=j-1;
		}
		Arrays.sort(arr1);
		for( int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Return the resulting array after reversing the numbers and sorting it");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int[] a=new int[n]; 
		System.out.println("enter the elements:");
		for(int i = 0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		getSorted(a,n);
		
	}

}
