package Pattern;

import java.util.Scanner;

public class FindIfExist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int l = s.nextInt(),r = s.nextInt(),n = s.nextInt();
        if(n>l&&n<r){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
