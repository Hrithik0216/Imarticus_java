package TestCases;

public class Example2 {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 8, 6, 3, 1, 12, 2, 5 };
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++) {
            j = i + 1;
            if (arr[i] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j = -1;
            }
        }
        System.out.println("The sorted array is:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out
                .print("The biggest number is " + arr[arr.length - 1] + " and is at the position " + (arr.length - 1));
        System.out.println();
        System.out.println("The smallest number is:" + arr[0]);
    }
}
