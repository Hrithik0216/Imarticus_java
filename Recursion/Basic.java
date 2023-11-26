package Recursion;

public class Basic {
    public static void main(String[] args) {
        //Print1();
        //printNum(1);
        System.out.println( printReverse(5));
    }
    static void printNum(int n){
        if(n==5){
            System.out.println(n);
            return ;     
        }
        System.out.println(n);
        printNum(n+1);//This is tail recursion
    }

    static void Print1(){
        System.out.println("Heloo world");
        Print2();
    }
    static void Print2(){
        System.out.println("Heloo world");
        Print3();
    }
    static void Print3(){
        System.out.println("Heloo world");
        Print4();
    }
    static void Print4(){
        System.out.println("Heloo world");
    }

    static int printReverse(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return printReverse(n-1);
    }
}
