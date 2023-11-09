package Pattern;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuffer sb = new StringBuffer(str);
        if(str.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a plaindrome");
        }
    }
}
