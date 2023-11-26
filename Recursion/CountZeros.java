package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(findZero(10000, 0));
    }
    static int findZero(int n, int c){
        
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            c +=1;
        }
        return findZero(n/10,c);
    }
}
