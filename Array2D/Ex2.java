package Array2D;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = s.nextInt();
        int a[][]=new int [row][col];
        System.out.println("Enter the matrix element: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("The array elements are: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Completed");
    }
}
