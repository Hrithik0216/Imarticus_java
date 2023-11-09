package Pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
