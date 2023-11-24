package LeetCode;

class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));
            if(s.charAt(j)=='i'){
                sb.deleteCharAt(sb.length()-1);
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
public class FaultyKeyboard {
    public static void main(String[] args) {
        Solution ob1 = new Solution();
        
        System.out.println(ob1.finalString("poiinter"));
    }
}
