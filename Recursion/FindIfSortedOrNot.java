package Recursion;

public class FindIfSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        System.out.println(finSorted(arr, 0));
    }
    static boolean finSorted(int arr[],int index){
        if(index == arr.length-1){
            return true ; //if only one element
        }
        return arr[index]<arr[index+1] &&finSorted(arr, index+1);
    }
}
