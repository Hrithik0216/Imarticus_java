package oops;

public class Recursion {
    public static void natPrint(int n) {
        // to print the natural numbers

        // Base case
        if (n == 1) {
            System.out.println(1);
        }

        //Recursive case
        else {
            System.out.println(n);
            natPrint(n - 1);
        }
    }

    public static void main(String[] args) {
        natPrint(10);
    }
}
/*
 * A function is called as a recursive function
 * if it calls itself in it function definition
 */