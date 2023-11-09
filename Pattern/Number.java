package Pattern;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }



         for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}
