package Pattern;

import java.util.Scanner;

public class MixedSeries2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int odd = 1, even=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=odd;j++){
                    System.out.print(odd + " ");
                }
                odd++;
            }else{
                System.out.print(even + " ");
                ++even;
            }
        }
    }
}
