package LogicFirst;

class cycle {
    void display() {
        System.out.println("Im a cycle");
    }
}

// This class is created just to override the method in cycle
/*
 * class TriCycle extends cycle{
 * void display(){
 * System.out.println("Im a triacycle");
 * }
 * }
 */

public class AnonymousClassEx {
    public static void main(String[] args) {
        cycle c= new cycle(){
     void display(){
        System.out.println("Im a triacycle");
    }
        }; //anonymous class
        
       
        
        c.display();
        cycle c2= new cycle();
        c2.display();
        
    }
}
