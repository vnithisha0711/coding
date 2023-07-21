package StringManipulation;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
//		String input = "Capgemini";
//		StringBuilder reversed = new StringBuilder(input).reverse();
//		String reversedString = reversed.toString();
//		System.out.println(reversedString); 
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input).reverse();
        String reversedString = reversed.toString();

        System.out.println("Reversed string: " + reversedString);

	}

}
