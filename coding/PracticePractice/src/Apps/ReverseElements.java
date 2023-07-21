package Apps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseElements {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("ACS", "EPAM", "ERR", "TCS");
        
        List<String> reversedList = list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
        
        System.out.println("Reversed elements:" +reversedList);
    }

}
