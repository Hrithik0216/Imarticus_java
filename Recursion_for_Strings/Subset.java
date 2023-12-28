package Recursion_for_Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subSet(arr));
    }

    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> finalList = new ArrayList<>();
        backTrack(finalList, new ArrayList<>(), arr, 0);
        return finalList;
    }
    public static void backTrack(List<List<Integer>> finalList, ArrayList<Integer> temp, int [] arr, int index){
        finalList.add(new ArrayList<>(temp));
        for(int i=index; i< arr.length;i++){
            temp.add(arr[i]);
            backTrack(finalList, temp, arr, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
