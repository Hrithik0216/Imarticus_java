package WeekendPractise;

import java.util.ArrayList;
import java.util.List;

public class PrimeLogic {
    static int count = 0;

    public static int[] Prime(int[] array) {
        List<Integer> primesList = new ArrayList<>();

        for (int num : array) {
            if (isPrime(num)) {
                primesList.add(num);
            }
        }

        int[] primeArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primeArray[i] = primesList.get(i);
        }

        return primeArray;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                return false;
            }
        }
        System.out.print("count: "+count);
        return true;
        
    }
}
