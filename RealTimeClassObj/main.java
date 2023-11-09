package RealTimeClassObj;
import RealTimeClassObj.logic;


public class main {
    public static void main(String[] args) {
        logic sorting = new logic();
        
        int arr[] = {1,6,4,5};
        int arr1[]=sorting.bubbleSort();
        int arr2[]=sorting.bubbleSortWithArguments(arr);

        
        LogicWithConstructors sortWithConstructors = new LogicWithConstructors(arr);
        int[] arr3 = sortWithConstructors.bubbleSortWithArguments(arr);
        for(int i:arr2){
            System.out.println(i);
        }
    }
}
