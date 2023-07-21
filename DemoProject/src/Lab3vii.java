import java.time.*;
import java.util.Scanner;

public class Lab3vii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the date here:");
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		int month=sc.nextInt();
		int date=sc.nextInt();
		
		LocalDate givendate=LocalDate.of(year, month, date);
		LocalDate presentdate=LocalDate.now();
		
		
		Period diff=Period.between(givendate, presentdate); 
		System.out.println("Difference is" +" " +diff.getYears()+"years" +" "
		+diff.getMonths()+" months" +" "+diff.getDays()+"days"+" ");
	}

}
