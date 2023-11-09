package Algorithm;

public class SecondLargest {
    static int SecondLARGEST(int a[]){
        int max1 = 0, max2 = 0;
        if(a[0]>a[1]){
            max1 = a[0];
            max2 = a[1];
        }else{
            max2 = a[0];
            max1 = a[1];
        }
        for(int i = 2;i<a.length;i++){
            if(a[i]>max1){
                max2 = max1;
                max1=a[i];
            }else if(a[i]>max2){
                max2 = a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        System.out.println(SecondLARGEST(arr));
    }
}
//Change the sign to find the second smallest number