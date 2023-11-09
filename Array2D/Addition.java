package Array2D;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = s.nextInt();
        System.out.print("Enter the number of cols: ");
        int col = s.nextInt();
        int a[][]=new int [row][col];
        int b[][]=new int [row][col];
        int c[][]=new int [row][col];
        System.out.println("Enter the A matrix element: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter the B matrix element: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                b[i][j]=s.nextInt();
            }
        }

        System.out.println("The A matrix array elements are: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The B matrix array elements are: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The addition of 2 matrices: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print((c[i][j]=a[i][j]+b[i][j]) +" ");
            }
            System.out.println();
        }

        System.out.println("The difference of 2 matrices: ");
        for(int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.print((c[i][j]=b[i][j]-a[i][j]) +" ");
            }
            System.out.println();
        }
        
    }
}
