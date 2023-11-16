package KunalOOPS;

interface Vehicle {
    void changeGear(int newGear);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

class Cycle implements Vehicle {
    int gear2;
    int speed2;

    public Cycle() {
        this.gear2 = 0;
        this.speed2 = 0;
    }

    public void changeGear(int newGear) {
        this.gear2 = newGear;
    }

    public void speedUp(int increment) {
        speed2 += increment;
    }

    public void applyBrakes(int decrement) {
        speed2 -= decrement;
    }

    public void display() {
        System.out.println("gear: " + gear2 + "\n+speed: " + speed2);
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Cycle ob1 = new Cycle();
        ob1.changeGear(2);
        ob1.applyBrakes(20);
        ob1.speedUp(40);
        ob1.display();
    }
}