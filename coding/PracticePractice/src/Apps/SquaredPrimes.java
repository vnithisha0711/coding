package Apps;

import java.util.Arrays;

public class SquaredPrimes {

	public static void main(String[] args) {
        int[] array = {3, 4, 632, 5, 2, 3, 5, 6};
        
        int[] squaredPrimes = Arrays.stream(array)
                .filter(SquaredPrimes::isPrime)
                .map(num -> num * num)
                .toArray();
        
        System.out.println(Arrays.toString(squaredPrimes));

	}
	private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
