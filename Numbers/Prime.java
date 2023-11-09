package Numbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int flag=0;
        for(int i=0;i<=n/2;i++){
            if(n%2==0)
            flag=1;
            break;
        }
        if(flag==0 && n!=0)
        System.out.println("It is a prime number");
        else
        System.out.println("It is not a prime number");

    }
}
