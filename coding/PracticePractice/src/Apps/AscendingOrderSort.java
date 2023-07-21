package Apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AscendingOrderSort {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(0);
		numbers.add(1);
		numbers.add(56);
		numbers.add(23);
		numbers.add(4);
		
//		Set<Integer> uniqueNumbers = new HashSet<>(numbers);
//        List<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);
		
		Collections.sort(numbers); //ascending order
		
		//Collections.sort(sortedNumbers, Collections.reverseOrder()); //descending order
		
		System.out.println("Sorted list: " + numbers);

	}

}
