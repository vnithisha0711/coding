package Apps;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
	 public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(3);
	        numbers.add(20);

	        List<Integer> missingNumbers = findMissingNumbers(numbers);

	        System.out.println("Missing numbers: " + missingNumbers);
	    }

	    public static List<Integer> findMissingNumbers(List<Integer> numbers) {
	        List<Integer> missingNumbers = new ArrayList<>();

	        for (int i = 3; i <= 20; i++) {
	            if (!numbers.contains(i)) {
	                missingNumbers.add(i);
	            }
	        }

	        return missingNumbers;
	    }

}
