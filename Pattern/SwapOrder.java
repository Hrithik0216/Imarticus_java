package Pattern;

import java.util.Scanner;

public class SwapOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the String: ");
        String str = s.nextLine();
        String [] result = str.split(" ");
        int n = result.length;
        for(int i=n-1; i>=0;i--){
            System.out.print(result[i]+" ");
        }

    }
}
