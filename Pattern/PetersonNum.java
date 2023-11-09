package Pattern;

import java.util.Scanner;

public class PetersonNum {
    static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int rem, sum = 0, temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + factorial(rem);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("It is a peterson number");
        } else {
            System.out.println("it is not a peterson number");
        }
        s.close();
    }
}
