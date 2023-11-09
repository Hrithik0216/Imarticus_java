
//bubble sort algorithm
package ArrayProblems;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = s.nextInt();
        int [] arr =new int [n];
        //int max = arr[0];
       //int [] arr1 = new int [n];
        int temp;

        //read array values
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt(); 
        }
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp; 
            }


          }
        }

        System.out.println("The second largest number is: "+arr[n-2]);
        System.out.println("Smallest: "+arr[0]);
    }
}
