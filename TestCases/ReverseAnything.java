package TestCases;

import java.util.Scanner;

public class ReverseAnything {
   public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    String n = a.next();
    char c;
    String s ="";//For storing output
    int len = n.length();
    for(int i = 0; i<len;i++){
        c = n.charAt(i);
        s = c + s;
    }
    System.out.println(s);
   }
    
}
