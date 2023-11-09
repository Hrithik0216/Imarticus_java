package Pattern;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int gcd=0,i,lcm;
        for(i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        lcm = (n1*n2)/gcd;
            System.out.println("Lcm "+lcm);
            System.out.println("GCD " +  gcd);
        
    }
}
