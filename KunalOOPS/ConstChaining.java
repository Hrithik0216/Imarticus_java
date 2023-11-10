package KunalOOPS;

public class ConstChaining {
    ConstChaining(){
        this(5);
    }
    ConstChaining(int x){
        this(5,10);
    }
    ConstChaining(int x, int y){
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        ConstChaining ob1 = new ConstChaining();
    }
}
