package WeekendPractise;

import java.util.ArrayList;

public class PalindromeLogic {
    public static String [] Palindrome(String [] str){
        ArrayList <String> PalindromeList = new ArrayList<>();
        for(String st: str){
            if(isPalindrome(st)){
                PalindromeList.add(st);
            }
        }
        String [] PalinArray = new String[PalindromeList.size()];
        for(int i =0;i<PalindromeList.size();i++){
            PalinArray[i]=PalindromeList.get(i);
        }
        return PalinArray;
    }
     public static boolean isPalindrome(String st){
        String rev = "";
        int len = st.length();
        for(int i=(len-1);i>=0;i--){
            rev = rev + st.charAt(i);
        }
        if(st.toLowerCase().equals(rev.toLowerCase())){ //we use .equals because it is used to compare the content at different mempry location, Whereas == checks if they refer to same memory location
            return true;
        }
        return false;
     }
}
