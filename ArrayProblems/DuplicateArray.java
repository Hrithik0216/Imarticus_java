package ArrayProblems;

import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Array length: ");
        int n = s.nextInt();
        int [] arr = new int [n];

        //Get user array elements
        System.out.print("Enter the array element: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        //Calc
        System.out.print("The repeated elements are: ");
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n;j++){
                if(arr[j]==arr[i])
                System.out.print(arr[j]+" ");
            }
            
        }
    }
}
