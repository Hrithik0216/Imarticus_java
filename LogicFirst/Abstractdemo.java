package LogicFirst;


abstract class Shape{
         int a,b,h;
        abstract int area(); 
    }
    class Square extends Shape{
         int area(){
            return a*a;
        }
    }
    class Triangle extends Shape{
        int area(){
            return (int)(0.5*b*h);
        }
    }
public class Abstractdemo {
    public static void main(String[] args) {
       Shape s[] = new Square[2];
       int index = 0;
        s[0] = new Square();
        s[0].a =2;
        s[1] = new Square();
        s[0].a =2;
        for(Shape i: s){
            System.out.println("The square area of "+index+" is "+i.area());
            index++;
        }
       

        Shape t=new Triangle();
        t.b=2;
        t.h=5;
        System.out.println("Traingle area: "+t.area());
    }
}
