/*Interface ---> tells what to do but not how to do 
 * was developed to have only function declaration and not definition but now in 1.8 version we can do both
 * So to define the method's body we must use default in the method declaration
*/

package LogicFirst;

interface Rideable {
    void ride();
    int MAX_SPEED = 20; //final static variable
    default void displayMessage() {
        System.out.println("Hello! from Rideabale interface");
    }
}

class Car implements Rideable {
    public void ride() {
        System.out.println("you are riding a car");
    }
    public void displayMessage(){
        System.out.println("Overiridng is also possible. I am from car class. ");//Overrided from Interface class
    }
}

class Bike implements Rideable {
    public void ride() {
        System.out.println("you are riding a bike");
    }
}

class Mechanic {
    void check(Rideable r) {
        System.out.println("Cheking");
        r.ride();
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Rideable r = new Bike();
        Mechanic m = new Mechanic();
        Bike b = new Bike();
        Car c = new Car();
        c.displayMessage();
        m.check(b);
        m.check(c);

        Rideable r2 = new Rideable(){ //anonymous class is used when you need to display only any one output. Also here we have instanciated an object using interface class andd it is possible only when we use anonymous class.(We have overrided abstract methods)
            public void ride(){
                System.out.println("You are riding a vintage car");
            }
        };
        r2.ride();

        Rideable r3 = ()->System.out.println("You are riding a vintage car");
        r2.ride();
        r3.ride();
    }
}

// Using Inheritance
/*
 * package LogicFirst;
 * 
 * abstract class Vehicle{
 * abstract void ride();
 * }
 * class Car extends Vehicle{
 * void ride(){
 * System.out.println("you are riding a car");
 * }
 * }
 * 
 * class Bike extends Vehicle{
 * void ride(){
 * System.out.println("you are riding a bike");
 * }
 * }
 * 
 * class Mechanic{
 * void check(Vehicle v){
 * System.out.println("Cheking");
 * v.ride();
 * }
 * }
 * public class InterfaceEx {
 * public static void main(String[] args) {
 * Mechanic m = new Mechanic();
 * Bike b = new Bike();
 * Car c = new Car();
 * m.check(b);
 * m.check(c);
 * }
 * }
 */

/*
 * Dynamic binding
 * The below is the output
 * Cheking
 * you are riding a bike
 * Cheking
 * you are riding a car
 */