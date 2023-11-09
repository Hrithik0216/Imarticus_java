package LogicFirst;

class Boxx {
    int length, breadth, height;

    Boxx(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }

    int volume() {
        return length * breadth * height;
    }

    Boxx doubleBox(){
        //since we are invoking using b1 we can access its len bred and height
        Boxx temp = new Boxx(2*length,2*breadth,3*height);
        /*temp.length = this.length;
        temp.breadth = this.breadth;
        temp.height = this.height;*/
        return temp; //here the return type is object so use class name for return type i.e we return an object
    }
}

public class ReturnObjects {
    public static void main(String[] args) {
        Boxx b1 = new Boxx(2,4,5);
        Boxx b2 = new Boxx(2,4,5);

        Boxx b3 = b1.doubleBox(); //we need an object double the size of b1
        System.out.println(b3.length);

    }
}
