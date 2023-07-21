package Apps;

import java.util.ArrayList;
import java.util.List;

public class MissingNum {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);

        int missingNumber = findMissingNumber(numbers);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(List<Integer> numbers) {
        int n = numbers.size() + 1; // Total numbers including the missing one
        int sum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n
        int actualSum = numbers.stream().mapToInt(Integer::intValue).sum(); // Sum of given numbers
        return sum - actualSum; // Missing number
    }


}
