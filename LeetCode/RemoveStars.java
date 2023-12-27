import java.util.Stack;

public class RemoveStars {
    public static String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='*'){
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "";
        }
        if(!stack.isEmpty()){
            while(stack.isEmpty()){
                str.append(stack.pop());
            }
        }
        return str.reverse().toString();
    }
    
    public static void main(String[] args) {
        String s = "leet**cod*e";
        removeStars(s);
        
    }
    
}
