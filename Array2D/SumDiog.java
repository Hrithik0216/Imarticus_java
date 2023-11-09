package Array2D;

import java.util.Scanner;

public class SumDiog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row = s.nextInt();
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("the array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Swapping diagonals calues in a matrix
        int temp;
        if (row == col) {
            for (int i = 0; i < row; i++) {
                temp = arr[i][i];
                arr[i][i] = arr[i][row - 1 - i];
                arr[i][row - 1 - i] = temp;
            }
        }

        System.out.println("The Swapped matrix is: ");
        {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }

        int left = 0, right = 0;
        if (row == col) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j) {
                        left += arr[i][j];
                    }
                    if (i + j == col - 1) {
                        right += arr[i][j];
                    }

                }
            }
        } else {
            System.out.println("It is not a square matrix");
            ;
        }
        System.out.print("Left dio: " + left);
        System.out.println();
        System.out.print("Right dio: " + right);

    }
}
