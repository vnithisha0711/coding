import java.util.Scanner;

public class Lab3ii {
	public static void MirrorImage(String str) {
		String string=str;
		String reverse=new StringBuffer(string).reverse().toString();
		System.out.println(string +"|"+ reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string here:");
		String str=sc.next();
		MirrorImage(str);

	}

}
