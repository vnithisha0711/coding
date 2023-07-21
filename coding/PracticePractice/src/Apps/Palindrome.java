package Apps;

public class Palindrome {

	public static void main(String[] args) {
		if (args.length != 1) {
            System.out.println("Invalid input. Please provide a single string argument.");
            return;
        }

        String inputString = args[0];

        if (isPalindrome(inputString)) {
            System.out.println("The string '" + inputString + "' is a palindrome.");
        } else {
            System.out.println("The string '" + inputString + "' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String inputString) {
        String reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equalsIgnoreCase(reversedString);

	}

}
