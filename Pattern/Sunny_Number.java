package Pattern;

import java.util.Scanner;

public class Sunny_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int sqrNext = n + 1;
        double sqrRoot = Math.sqrt(sqrNext);

        if (sqrRoot - ((Math.floor(sqrRoot))) == 0) {
            System.out.println("It is a a Sunny number");
        } else {
            System.out.println("It is not a sunny number");
        }
        s.close();
    }
}
