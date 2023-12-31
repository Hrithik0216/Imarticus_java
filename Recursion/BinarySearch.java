package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 0, arr.length - 1, 6));

    }

    static int binarySearch(int arr[], int start, int end, int target) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid; 
            } else if (target > arr[mid]) {
                return binarySearch(arr, mid + 1, end, target);
            } else if (target < arr[mid]) {
                return binarySearch(arr, start, mid - 1, target);
            }
        }
        return -1;
    }
}
