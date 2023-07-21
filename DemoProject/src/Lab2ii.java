import java.util.Arrays;
import java.util.Scanner;

public class Lab2ii {

	public static void sortString(String[] arr) {
		//String[] arr=new String[n];
		int c=arr.length;
		Arrays.sort(arr);
		if(c%2==0) {
			int m=c/2;
			for(int i=0;i<=m-1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=m;i<c;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		else {
			int n=(c/2)+1;
			for(int i=0;i<=n-1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=n;i<c;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		for(int i=0;i<c;i++) {
			System.out.println(arr[i]+"\n");
		}
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" how many elements in the array?");
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("enter the names:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		sortString(arr);
	}
	
}
