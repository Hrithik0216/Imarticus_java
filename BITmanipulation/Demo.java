package BITmanipulation;

public class Demo {
    static String DecimalToBinary(int n){
        String b="";
        while(n>=1){
        int rem = n%2;
        n/=2;
        b = rem +b;
        }
        return b;
    }
    static int BinaryToDecimal(String b){
        int result = 0;
        int powerOf2= 1;
        for(int i = b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                result += powerOf2; 
            }
            powerOf2*=2;
        }
        return result;
    }
    public static void main(String[] args) {
        String b = DecimalToBinary(45);
        System.out.println(b);
        System.out.println(BinaryToDecimal(b));
    }
}
