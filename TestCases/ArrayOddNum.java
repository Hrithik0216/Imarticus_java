package TestCases;

import java.util.Scanner;

public class ArrayOddNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Element in the array: ");
        int n = s.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements one by one: ");
        for(int i=0; i<n; i++){
            
            arr[i] = s.nextInt();
        }

        System.out.println("Print the elements in the array: ");
        for(int i=0; i<n; i++){
            if(i==n-1){ 
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }            
        }

        System.out.println("The odd elements in the array are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }

        

    }
}
