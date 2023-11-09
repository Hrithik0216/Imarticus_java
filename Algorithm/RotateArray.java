package Algorithm;

public class RotateArray {
    /*static void RotateONE(int [] arr){
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length -1] = temp;
    } */

    static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;
        }
    }

    static void Rotate(int a[],int k){
        //Importanat conditions
        k = k%a.length;
        if(k<0){
            k=k+a.length;
        }
        //
        /*for(int i=1;i<=k;i++){
            RotateONE(a);
        }*/
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Rotate(arr, 5);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
