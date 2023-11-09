package TestCases;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        //String str = String.valueOf(n);
        int rem, sum = 0, product=1;

        while(n>0){
            rem = n%10;
            sum = (int)(sum + rem);
            product =(int) (product *rem);
            n = n/10;
        }
        if(sum == product){
            System.out.println("It is a Spy number");
        }else{
            System.out.println("It is not a spy number");
        }

    }
}
