package ArrayProblems;

import java.util.Scanner;

public class seperateOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        int n = s.nextInt();
        // Initialized array length
        int[] array = new int[n];
        int[] odd = new int[n]; //{0,0,0,0,0} when n =5
        int[] even = new int[n];

        // for reading array elements from user
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        // for displaying
        System.out.println("array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                even[i] = array[i];
            } else {
                odd[i] = array[i];
            }
        }

        System.out.println("Odd: ");
        for (int i = 0; i < n; i++) {
            if (odd[i] != 0) {
                System.out.print(odd[i]);
                if (i != n - 1) {
                    System.out.println(", ");
                }
            }

        }
        System.out.println();
        System.out.println("Even: ");
        for (int i = 0; i < n; i++) {
            if (even[i] != 0) {
                System.out.print(even[i]);
                if (i != n - 1) {
                    System.out.println(", ");
                }
            }
        }

    }
}