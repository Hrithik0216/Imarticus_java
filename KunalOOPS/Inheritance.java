package KunalOOPS;

class Cycle {
    private static int gear;
    private static int speed;

    Cycle(int gears, int speed) {
        gear = gears;
        Cycle.speed = speed;

    }

    public void braking(int braking) {
        speed -= braking;
    }

    public void accelaration(int accelaration) {
        speed += accelaration;
    }

    public String display() {
        return "No of gear: " + gear + "\nspeed is " + speed;
    }
}

class MountainBike extends Cycle {
    private int seatHeight;

    MountainBike(int gear, int speed, int sHeight) {
        super(gear, speed);// super keyword is used to inherit the parentclass variables in child class
        this.seatHeight = sHeight;

    }

    // Method overiding
    public String display() {
        // return super.display(); //For non-static variables and methods

        accelaration(4);
        // return Cycle.display();
        return (super.display() + "\nthe seat height is " + seatHeight);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cycle ob2 = new Cycle(1, 10);
        // ob2.accelaration(25);
        System.out.println(ob2.display());
        MountainBike ob1 = new MountainBike(2, 50, 45);
        System.out.println(ob1.display());
    }
}
