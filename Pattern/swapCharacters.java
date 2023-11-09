package Pattern;

import java.util.Scanner;

public class swapCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        int n = str.length();
        char[] arr = str.toCharArray();

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                System.out.print(arr[i+1] +""+ arr[i]);//"" is given for concating characters and not adding values in array
            }
        }else{
            for(int i=0;i<n-1;i+=2){
                System.out.print(arr[i+1] +""+ arr[i]);
            }
            System.out.print(arr[n-1]);
        }
    }
}
