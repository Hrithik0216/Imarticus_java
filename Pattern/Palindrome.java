package Pattern;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();
        String rev = "";
        int len = str.length();
        for(int i=(len-1);i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.toLowerCase().equals(rev.toLowerCase())){ //we use .equals because it is used to compare the content at different mempry location, Whereas == checks if they refer to same memory location
            System.out.println("it is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
