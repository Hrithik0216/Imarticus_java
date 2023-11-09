package ArrayProblems;

public class NormalSorting {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int temp,count =0, flag =1;
        for (int j = 0; j <arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(j);
                    j=-1; //This j is added is with j++     
                    flag++;
                           
                }
                count++;
                
            
        }
        System.out.println("Count"+count);
        if(flag ==1){
            System.out.println("Given array is a sorted array");
        }else{
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        }
        
    }
    
}
