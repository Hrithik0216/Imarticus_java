package RealTimeClassObj;

public class logic {
    public int[] bubbleSort() {
        int[] arr = { 4, 5, 1, 22, 55, 11, 66, 55 };
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;

    }
     /*public int[] bubbleSort(int [] arr) {
        //int[] arr = { 4, 5, 1, 22, 55, 11, 66, 55 };
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;

    }*/


    public int[] bubbleSortWithArguments(int arr[]) {
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

}
