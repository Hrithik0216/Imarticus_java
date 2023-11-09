package TestCases;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        int arr[] = {7,8,12,6,3,4,1,9,7,6,1,4};
        int i,j;
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(i = 0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");

                }
            }
        }
    }
}
