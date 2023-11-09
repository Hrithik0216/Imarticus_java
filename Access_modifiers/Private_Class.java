package Access_modifiers;

class second{
    private int x =100;
     private int y = 110;
     void display(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
     }
}
public class Private_Class {
    private int a =10;
    public int b = 11;
    public static void main(String[] args) {
        Private_Class myObj = new Private_Class();
        System.out.println("a: "+myObj.a);
        System.out.println("b: "+myObj.b);

        second myObj1= new second();
        //System.out.println("x: "+myObj1.x);
        //System.out.println("y: "+myObj1.y);
        myObj1.display();

    }
}
