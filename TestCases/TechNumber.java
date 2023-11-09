package TestCases;

import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = s.nextInt();
        int len, num;
        
        //Convert the integer to string to find its length
        String str = String.valueOf(a);
        len = str.length();
        if(len == 4){
            num = (a/100)/*For first 2 digit */ + (a%100);/*For last 2 digits */
            if(num*num == a){
                System.out.println("It is a tech number");
            }else{
                System.out.println("It is not a tech number");
            }

        }else{
            System.out.println("Not a valid number");
        }


    }
}
