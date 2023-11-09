// program to print arrray elements
package TestCases;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*int [] arr[5] = {10,20,1,0,1050,};
        //System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] = " + arr[i]);
        }*/

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the string: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        /*
        arr[i]
        arr[0] 
        Here n = number of elements
        n-1 = 4
        arr[n-1]= arr[4] which is the last before element in the array 
         * arr[1]
         * arr[2]
         * arr[3]
         * arr[4]
        */
        System.out.println("Print the elements one by one: ");
         for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Elements stored in an array: " );
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.println(arr[i]);
            }else{
                 System.out.print( arr[i]+",");
            }
            // System.out.print( arr[i]+","); //In the output 202,20,20,20,20, we have a comma. so to remove the last comma
        }
        //System.out.println("Completed");
    }
}
