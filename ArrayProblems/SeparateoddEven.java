package ArrayProblems;

import java.util.Scanner;

public class SeparateoddEven {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        int n = s.nextInt();
        // Initialized array length
        int[] array = new int[n];
        int[] odd = new int[n]; //{0,0,0,0,0} when n =5
        int[] even = new int[n];
        int even_index = 0;
        int odd_index = 0;

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
                even[even_index++] = array[i];
            } else {
                odd[odd_index++] = array[i];
            }
        }

        System.out.println("Odd: ");
        for (int i = 0; i < odd_index; i++) { //here odd_index value is not 0 it the value obtained at odd_index++
            System.out.print(odd[i]+" ");

        }
        System.out.println();
        System.out.println("Even: ");
        for (int i = 0; i < even_index; i++) {
            System.out.print(even[i]+" ");
            
        }
    }
}
