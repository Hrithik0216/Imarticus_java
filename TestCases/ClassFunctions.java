package TestCases;

class Calc {
    
    public int add(int c, int d){
        return c+d;
    }
    public int sub(int c, int d){
        return c-d;
    }
    public int div(int c, int d){
        return c/d;
    }
}
public class ClassFunctions {
    public static void main(String[] args) {
        Calc ob1 = new Calc();
        System.out.println(ob1.add(20, 2));
        System.out.println(ob1.sub(20, 2));
        System.out.println(ob1.div(20, 2));
        //ob1.add(20, 2);
    }
}
