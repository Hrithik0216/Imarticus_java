import java.util.Scanner;

public class LuckyNum {
    public boolean lucky(int n, int counter){
        if(n%counter==0){
            return false;
        }
        if((n<counter)){
            return true;
        }
        return lucky(n-(n/counter), counter+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = s.nextInt();
        LuckyNum ob = new LuckyNum();
        
        System.out.println(ob.lucky(n,2));
    }
}
