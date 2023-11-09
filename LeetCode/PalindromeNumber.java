package LeetCode;

public class PalindromeNumber {
    public static boolean ispalindrome(int x){
        if(x==0){
            return false;
        }
        if(x<0||x%10==0){
            return false;
        }
        int temp = x;
        int rev = 0;
        int rem;
        while(x>0){
            rem = x%10;
            rev = (rev*10)+rem;
            x/=10;
        }
        if(temp==rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome(121));
    }
}
