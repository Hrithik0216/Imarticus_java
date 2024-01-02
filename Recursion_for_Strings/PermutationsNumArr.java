package Recursion_for_Strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationsNumArr {
    public static void main(String[] args) {
        int[] nums = { 1, 2};
        System.out.println(permutate(nums));

    }

    public static List<List<Integer>> permutate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    public static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> templist) {
        if (templist.size() == nums.length) {
            // result.add(templist);
            result.add(new ArrayList<>(templist));
            return;
        }

        for (int number : nums) {
            if (!templist.contains(number)) {
                templist.add(number);
                backtrack(nums, result, templist);
                templist.remove(templist.size() - 1);
            }

        }
    }
}
