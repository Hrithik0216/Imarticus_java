package Recursion;

public class TargetElementInARotatedSortedArray {
    public static void main(String[] args) {
        int arr[] ={5,6,7,8,1,2,3};
        System.out.println(findTarget1(arr, 0, arr.length-1, 8));
    }
    static int findTarget1(int arr[], int s, int e,int target){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        //left side of mid
        if(arr[s]<=arr[mid]){
            if(target>=arr[s] && target<=arr[mid]){
                return findTarget1(arr, s, mid-1, target);
            }else{
                return findTarget1(arr, mid+1, e, target);
            }
        }
        //right side of mid
        if(target>=arr[mid] && target<=arr[e]){
            return findTarget1(arr, mid+1, e, target);
        }else{
            return findTarget1(arr, s, mid, target);
        }
    }
}
