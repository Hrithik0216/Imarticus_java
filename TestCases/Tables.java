import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n;
        for(int i = 1; i<=a;i++){
            System.out.println(a*i);
        }
    }
}
