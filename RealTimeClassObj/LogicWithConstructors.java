package RealTimeClassObj;

public class LogicWithConstructors {
    int array[];
    public LogicWithConstructors(int arr[]){
        this.array=arr;
    }
    public int[] bubbleSortWithArguments(int[] array) {
        int temp;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;
    }
}
