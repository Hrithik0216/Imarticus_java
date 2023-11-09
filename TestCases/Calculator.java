package TestCases;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Calculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int first, second;
        double result=0;
        char ch;

        System.out.print("Enter the first number: ");
        first = a.nextInt();

        System.out.print("Enter the second number: ");
        second = a.nextInt();
        System.out.print("Enter the character: ");

        ch = a.next().charAt(0);
        switch(ch){
            case '+': 
                result = first + second;
                break;
            case '-': 
                result = first - second;
                break;
            case '*': 
                result = first * second;
                break;
            case '/': 
                result = first / second;
                break;
            default:
            System.out.print("Error! The operator is incorrect: ");
        }
        System.out.println("Result = "+ result);
        System.out.println("Format first = %f\n", result);
        System.out.println("Format first = %.2f\n", result);
        System.out.println("%d %c %d =%.2f\n", first, ch, second, result);
        System.out.println(first + " "+ch+ " "+second+"="+result);
        /*Printing in specific data format
           int = %d or %i
           double = %f (for .6 decimal digits, %.2f for 2 digits)
           char = %c
           string = %s
           float = %f 
         */
    }
}
