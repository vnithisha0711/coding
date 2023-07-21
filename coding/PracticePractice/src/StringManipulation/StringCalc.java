package StringManipulation;

import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((prev, curr) -> prev.endsWith(curr) ? prev : prev + curr)
                .orElse("");

//        String result = input.chars()
//                .mapToObj(c -> String.valueOf((char) c))
//                .distinct()
//                .collect(Collectors.joining());

        System.out.println("Output: " + result);
	}

	
}
