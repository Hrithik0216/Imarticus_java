package Recursion;

import java.util.ArrayList;

public class FindEveryTargetElement {
    public static void main(String[] args) {
        int arr [] = {1,22};
        System.out.println(findTargets(arr, 0, 22, new ArrayList<>()));
    }
    static ArrayList<Integer> findTargets(int arr[], int index,int target, ArrayList<Integer> list){
        if(index>arr.length-1){
            return list ;
        }
        if(arr[index]==target){
            list.add(arr[index]);
            //list.add(index);

        }
        return findTargets(arr,index+1,target,list);
    }
}
