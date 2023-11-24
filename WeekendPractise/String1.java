package WeekendPractise;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.next();
        System.out.println(String.join(" ",s.split("")));
        

        //System.out.println(s.replace("", " ").substring(1));
        System.out.println(s.replace("", " ").substring(1));

    
        
        StringBuilder sb = new StringBuilder();
        char [] characters = s.toCharArray();
        for(int i = 0; i<characters.length;i++){
            sb.append(characters[i] +" ");
        }
        
        System.out.println(sb.toString());
    }
}
