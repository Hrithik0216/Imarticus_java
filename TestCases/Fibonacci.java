package TestCases;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the range of numbers: ");
        int n = a.nextInt();
        int f = 0, s= 1, t;
        System.out.print(f+" "+s+" ");
        for(int i=3; i<=n;i++){
             t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;
        }
        
    }
}
