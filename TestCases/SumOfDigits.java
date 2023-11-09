package TestCases;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long h=0;
        for(long i=0;i<=a;i++){
            h+=i;
        }
        System.out.println(h);
    }
}