package TestCases;

//import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

    public static void Find(int[] arr, int t, int i, boolean isSorted) {

        if (isSorted) {
            if (i < 0) {
                System.out.println("Element not found.");
            } else if (arr[i] == t) {
                System.out.println("Index of the target element after sorting: " + i);
            } else {
                Find(arr, t, i - 1, true);
            }
        } else {
            System.out.println("It is not sorted");

        }
    }

    public static boolean isSorted(int arr[]) {
            int i =0;
            if (arr[i] > arr[i + 1]) {
                return false;
            } 
        
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target element: ");
        int t = s.nextInt();
        int arr[] = { 11, 10, 12, 22, 49, 58, 78, 100 };
        // Arrays.sort(arr);
        // isSorted(arr, arr.length-1);
        Find(arr, t, arr.length - 1, isSorted(arr));
    }
}
