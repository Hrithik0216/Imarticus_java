package ArrayProblems;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = s.nextInt();
        int [] arr =new int [n];
        int max = arr[0];

        //read array values
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt(); 
        }
        for(int i=1;i<n;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("The greatest number is "+max);
    }
}
