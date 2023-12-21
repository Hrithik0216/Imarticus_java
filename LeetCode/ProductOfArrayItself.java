public class ProductOfArrayItself {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate product of elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate product of elements to the right of each index and multiply with the result array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
}
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        for(int i: result){
            System.out.print(i + " ");
        }
        
    }
}
