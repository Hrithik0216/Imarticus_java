package ArrayProblems;

import java.util.Scanner;

public class FindOccurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = s.nextInt();
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number to search in the array: ");
        int search = a.nextInt();
        int count = 0;
        int [] arr = new int [n];

        System.out.println("The array elements are:");
        for(int i=0;i<n;i++){
            arr [i] = s.nextInt();
        }

        //for calc
        for(int i=0;i<n;i++){
            if(arr[i] == search)
            count++;
        }
        if(count>0)
        System.out.println("occurance: "+count);
        else
        System.out.println("No repetation");
        
    }
}
