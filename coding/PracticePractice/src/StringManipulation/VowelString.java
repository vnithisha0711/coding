package StringManipulation;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        long vowelCount = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> isVowel(c))
                .count();

        System.out.println("Number of vowels: " + vowelCount);

    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
