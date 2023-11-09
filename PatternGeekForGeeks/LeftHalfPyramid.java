package PatternGeekForGeeks;

import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = s.nextInt();
        int i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
