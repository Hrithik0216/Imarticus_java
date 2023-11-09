import java.util.Scanner;

public class SumNat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        int  num = s.nextInt();
        int rev = 0, rem=0;

        //sum of n natural numbers
        for(int i=2;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum); 

        //sum of even numbers under n
        for(int i =2;i<=n;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);

        //sum of odd numbers under n
        for(int i =2;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);

        //Reversing a number
        while(n>0){
            rem = num %10;
            rev = rev*10 + rem;
            num = num/10;
        }
    }
}
