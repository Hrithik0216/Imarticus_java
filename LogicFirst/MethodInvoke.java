package LogicFirst;

 class Box{
    int len,bred,height;
    static int count;

    Box(int l,int b, int h){
        len = l;
        bred=b;
        height = h;
    }

    int volume(){
        return len*bred*height;
    }
    
    static{
        System.out.println("From the static block");
        count= 0;
    }

}

public class MethodInvoke {
    public static void main(String[] args) {
        /*Box BlackBox = new Box();
        BlackBox.len = 10;
        BlackBox.bred = 20;
        BlackBox.len = 30;
        BlackBox.height = 10;
        System.out.print("Volume: "+BlackBox.volume());*/
        System.out.println("Main starts here");
        System.out.println("Before creating class objects");
        Box b1=new Box(10,20,20);
        System.out.println("after creating class object");
        System.out.println("b1 using constructor volume: "+b1.volume());
        
        Box b2=new Box(10,20,20);
        System.out.println("b1 using constructor volume: "+b2.volume());;

        Box b3=new Box(10,20,20);
        System.out.println("b1 using constructor volume: "+b3.volume());;

        Box b4=new Box(10,20,20);
        System.out.println("b1 using constructor volume: "+b4.volume());;
    }
    
}
