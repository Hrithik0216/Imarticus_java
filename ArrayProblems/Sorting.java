package ArrayProblems;
//Bubble sorting
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int temp, flag = 0,count =0, count1 =0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(i +"," + j);
                    flag++;
                    
                }
                count++;
            }
            count1++;
            
        }
        //System.out.println("Count: "+count);
        System.out.println("Count: "+count1*count);
        if (flag == 0) {
                System.out.println("It is sorted");
            } else {
                for (int a = 0; a < arr.length; a++) {
                    System.out.println(arr[a] + " ");
                }

            }

    }
}