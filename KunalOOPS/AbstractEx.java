package KunalOOPS;

abstract class Computer {
    abstract void turnOff();

    void turnOn() {
        System.out.println("Turning on");
    }
}

class Hp extends Computer {
    void turnOn() {
        System.out.println("Turning on Hp");
    }

    void turnOff() {
        System.out.println("Turning off hp");
    }
}

class Dell extends Computer {
    void turnOn() {
        System.out.println("Turning on dell");
    }

    void turnOff() {
        System.out.println("Turning off dell");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        // Computer ob3 = new Computer();
        Hp ob1 = new Hp();
        ob1.turnOn();
        ob1.turnOff();
        Dell ob2 = new Dell();
        ob2.turnOn();
        ob2.turnOff();
    }
}
