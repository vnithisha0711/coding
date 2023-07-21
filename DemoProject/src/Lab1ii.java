import java.util.Scanner;

public class Lab1ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the color:");
		Scanner sc=new Scanner (System.in);
		String color=sc.next();
		
		switch(color) {
		case "red": System.out.println("stop");
		break;
		case "yellow": System.out.println("ready");
		break;
		case "green": System.out.println("go");
		break;
		
		default:System.out.println("INVALID COLOR");
		}
		
		
	}

}
