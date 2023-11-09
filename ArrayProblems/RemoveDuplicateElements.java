package ArrayProblems;

import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Array length: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        int replaceIndex = 0, flag, i,j,k;

        for(i = 0;i<n;i++){
            flag = 0;

            for (j = i+1; j<n;j++){
                if(arr[i]!=arr[j])
                break;
            }

            for(k=0; k<replaceIndex;k++){
                if(temp[k]==arr[])
            }




        }

        
    }
}
