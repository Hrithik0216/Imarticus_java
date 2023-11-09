package TestCases.NumberPattern;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j); 
            }
            System.out.println();
        }
        
    }
}
/*Change print(i) to print
 * 1
 * 22
 * 333
 * 4444
 */