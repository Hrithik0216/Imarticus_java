package Algorithm;

public class SlidingWindow {
    static int slidWindow(int arr [], int k){
        int maxSum = Integer. MIN_VALUE;
        int wSum  = 0;

        for(int i = 0; i<k;i++){
            wSum += arr[i];
        }
        for(int i=k;i<arr.length; i++){
            wSum = wSum + arr[i] - arr[i-k];
            maxSum = Math.max(wSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(slidWindow(arr, k));
        
    }
}
