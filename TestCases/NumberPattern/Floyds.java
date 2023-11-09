package TestCases.NumberPattern;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int a = s.nextInt();
        int k = 1;
        
        for (int i = 1; i <= a; i++) {
            
            // Print spaces
            for (int space = 1; space <= a - i; space++)
                System.out.print(" ");
            
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }

            System.out.println();
        }
    }
}
