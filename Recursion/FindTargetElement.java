package Recursion;

public class FindTargetElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,8};
        System.out.println(findTarget(arr, 5, 0));
    }
    static int findTarget(int [] arr, int target, int index){
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findTarget(arr, target, index+1);
    }
}
