package Apps;

public class RevString {

	public static void main(String[] args) {
		
        String inputString = "today is Wednesday";
        
        String reversedString = reverseString(inputString);
        
        System.out.println("Reversed string: " + reversedString);
    }
    
    public static String reverseString(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedBuilder = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedBuilder.append(words[i]);
            if (i != 0) {
                reversedBuilder.append(" ");
            }
        }
        
        return reversedBuilder.toString();
		

	}

}
