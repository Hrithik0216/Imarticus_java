package TestCases.NumberPattern;

import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i = a; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);

            }
            System.out.println();;
        }
    }
}
/*Change Print(i) to print
 * 55555
 * 4444
 * 333
 * 22
 * 1
 */