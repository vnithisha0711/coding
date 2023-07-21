package Apps;

import java.util.Arrays;
import java.util.Comparator;

public class SortingString {

	public static void main(String[] args) {
		String[] strings = {"Capgemini", "Cognizant", "Accenture", "TCS", "EPAM"};

        Arrays.sort(strings);
        
       // Arrays.sort(strings,Comparator.reverseOrder());
       
     /*   
        //using lambda expressions
        Arrays.sort(strings, (s1, s2) -> s1.compareTo(s2)); //ascending order
        Arrays.sort(strings, (s1, s2) -> s2.compareTo(s1)); //descending order
        
        //using streams
        String[] sortedArray = Arrays.stream(strings)
                .sorted()
                .toArray(String[]::new); // ascending order
        String[] sortedArray = Arrays.stream(strings)
                .sorted(Collections.reverseOrder())
                .toArray(String[]::new); // descending order
                */

        System.out.println("Sorted array in ascending order: " + Arrays.toString(strings));


	}

}
