package Recursion;

import java.util.Arrays;

public class QuickSort {
    static void quicksort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int s = low, e = high, mid = (s+e)/2, pivot = arr[mid];
        while(s<=e){
            while (arr[s]<pivot) {
                s++;                
            }
            while (arr[e]>pivot) {
                e--;                
            }
            //When both while lopp condition fails
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            System.out.println("Debug array: "+Arrays.toString(arr));
        }
        quicksort(arr, low, e);
        quicksort(arr, s, high);
    }
    public static void main(String[] args) {
        int arr[] = {9,7,8,9,4,5,6};
        int len = arr.length-1;
        quicksort(arr, 0, len);
        System.out.println(Arrays.toString(arr));
    }
}
