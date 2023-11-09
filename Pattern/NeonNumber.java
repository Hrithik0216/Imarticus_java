package Pattern;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= s.nextInt();
        int sq = (int) Math.pow(n,2);
        System.out.println(sq);
        int temp = sq;
        int sum = 0;
        int digit;
        
        while(sq>0){
            digit = sq%10;
            sum = sum +digit;
            sq=sq/10;
        }
        System.out.println(sq);
        //System.out.println(temp);
        if (sum==n){
            System.out.println("It is a neon number");
        }else{
            System.out.println("Not an neon number");
        }

    
    }
}
