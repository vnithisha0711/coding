import java.util.*;
import java.util.Scanner;

public class Lab2i {
	
	public static int getSecondSmallest(int a[]) {
		
		Arrays.sort(a);
	    return a[1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Get the second smallest element in the array  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n= sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("second element:" + getSecondSmallest(a));
	}
}
