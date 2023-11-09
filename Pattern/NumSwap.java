package Pattern;

import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        // get array elements
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = s.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i <= n -1; i += 2) {
                System.out.print(arr[i + 1] + " " + arr[i]+" ");
            }
        } else {
            for (int i = 0; i < n - 1; i += 2) {
                System.out.print(arr[i + 1] + " " + arr[i]+" ");
            }
            System.out.print(arr[n - 1]);

        }
    }
}
