package TestCases;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int rem, len, sum = 0, temp;
        String str = String.valueOf(n);
        len = str.length();
        temp = n;

        while (n > 0) {
            rem = n % 10;
            sum = (int) (sum + Math.pow(rem, len));
            n = n / 10;
        }

        if (sum == temp) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
