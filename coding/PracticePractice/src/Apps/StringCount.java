package Apps;

public class StringCount {

	public static void main(String[] args) {
		String inputString = "cccapgemini";
        char targetLetter = 'c';

        int occurrenceCount = countLetterOccurrences(inputString, targetLetter);
        System.out.println("Occurrences of '" + targetLetter + "': " + occurrenceCount);
    }

    public static int countLetterOccurrences(String inputString, char targetLetter) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetLetter) {
                count++;
            }
        }
        return count;

	}

}
