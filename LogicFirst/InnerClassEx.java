package LogicFirst;


class Outer{
    int num;
    void outerDisplay(){
        System.out.println("Outer display");
    } 
    class Inner{
    int x;
    static void innerDisplay(){
        System.out.println("Inner display");
    } 
}
}


public class InnerClassEx {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.num = 2;
        o.outerDisplay(); 

        //Outer.Inner i = o.new Inner();  //Before defining static for inner class
        Outer.Inner i = new Outer.Inner(); 
        i.innerDisplay(); 
    }
}
