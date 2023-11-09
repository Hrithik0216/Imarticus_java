package PatternGeekForGeeks;

import java.util.Scanner;

public class SquareHollowPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        int i,j;
        //for rows
        for(i=0;i<n;i++){
            //for coloums
            for(j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
