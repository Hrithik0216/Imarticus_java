package Algorithm;

class Solution {
    public int[] sortColors(int[] nums) {
        int low = 0, mid = 0, temp, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
}

public class Dutch_NationalFlag {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int[] arr = {1, 0, 2};

        int[] result = ob.sortColors(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
 