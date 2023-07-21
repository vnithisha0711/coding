package Apps;

import java.util.Arrays;
import java.util.List;

public class SortAsc {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 0, 1, 56, 23, 4);

        System.out.println("Original list: " + numbers);

        sortNumbers(numbers);

        System.out.println("Sorted list: " + numbers);
    }

    public static void sortNumbers(List<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

	}

}
