package TestCases;

import java.util.Scanner;

public class InvAndNorTri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = s.nextInt();
        for(int h=1;h<=n;h++){
            for(int r = n; r>=h; r--){
                System.out.print("*");
            }
            System.out.println();
         }
         for(int i=2; i<=n; i++){
            for(int j=1;j<=i; j ++){
                System.out.print("*");
            }
            System.out.println();
         }
        
    }
    
}
