package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfDigits(1234);
        System.out.println(sum);
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sumOfDigits(n / 10);

    }
}
