package Recursion;

public class PalindromeNum {
    public static void main(String[] args) {
        //System.out.println(reverse(123));
        System.out.println(palin(123));
        
    }
    static int reverse(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        
        return rem * (int)Math.pow(10, (int)Math.log10(n)) + reverse(n / 10); //The result of (int)Math.log10(n) gives the number of digits in n minus 1.
    }
    static boolean palin(int n){
        return n == reverse(n);
    }
}
