import java.util.Arrays;
import java.util.Scanner;

public class Lab2iv {
	public static int modifyArray(int arr[],int n){
		
		
		
		if(n==0||n==1) {
			return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the array size:");
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter the elements:");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		Arrays.sort(arr);
        int k=modifyArray(arr,n);
        for(int i=0;i<k;i++) {
        	System.out.println(arr[i] +" ");
        }
		
	}

	
}