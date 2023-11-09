package LogicFirst;

class Box2{
    int len,bred,height;
    static int BoxCount;
    //It uses separate memory for count 
    static{
        System.out.println("From the static block");
        BoxCount= 0;
    }

    //access static methods
    static void displayBoxCount(){
        System.out.println("Box count in static method: "+BoxCount);
    }

    //using constructor
    Box2(int le, int br, int he){
        len=le;
        bred=br;
        height = he;
        BoxCount++;
    }

    Box2(){
        len =10;
        bred=11; //automatic assign
        height=12;
        BoxCount++;
    }

    Box2(int k){
        len = bred=height=k;
    }
    //Passing objects as argument
    boolean isEqual(Box2 b){ 
        if(len == b.len && bred==b.bred && height==b.height){
            return true;
        }else{
            return false;
        }

    }

    //using setter method
    void setDim(int l, int b, int h){
        len = l;
        bred=b;
        height=h; //this pointer is used if both paramerter variables are same like instance variables this.height=height
        BoxCount++;
    }

    int volume(){
        return len*bred*height;
        
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Box2 BlackBox = new Box2(2,6,4);
        System.out.print("Volume using Constructor: "+BlackBox.volume());
        System.out.println();
        BlackBox.setDim(2, 6, 4);
        System.out.print("Volume using Setter: "+BlackBox.volume());

        Box2 BlackBox2 = new Box2(2,6,3);//if no parameters passed it take the above values automatically
        System.out.println();
        System.out.println("Find if all values in objects are equal: "+BlackBox2.isEqual(BlackBox));
        Box2 Qube = new Box2(12);
        System.out.println("Qube volume: "+Qube.volume());

        System.out.println(Box2.BoxCount);
        Box2.displayBoxCount();
    }
}
