package Pattern;

import java.util.Scanner;

public class AbundantNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int i,k=0,sum = 0;
        int num[]= new int [n];
        for(i=1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum>n){
                System.out.println("it is a abundant number");
            }else{
                System.out.println("not an abundant number");
            }
    }
}
