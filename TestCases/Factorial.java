package TestCases;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner a  = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = a.nextInt();
        int b=1;
        for(int i=n; i>=1; i--){ 
            b=b*i;
        }
        System.out.println(b);
    }
}
