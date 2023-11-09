import java.util.Scanner;

public class NatNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int a = s.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }
        for(int i=a;i>=1;i--){
            System.out.println(i);
        }

    }
}
