package Pattern;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the ticket number: ");
        int n = s.nextInt(), k= s.nextInt();
        int arr [] = new int[n];
        //get array elements
        for(int i=0;i<=n-1;i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0;i<=n-1;i++){
            if(arr[i]%k==0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        
    }
}
