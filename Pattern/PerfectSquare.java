package Pattern;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the numbers: ");
        int n1= s.nextInt();
        int n2 = s.nextInt();
        if(n1==n2){
            System.out.println("It is a perfect square");
        }else{
            System.out.println("No it is not");
        }
    }
}
