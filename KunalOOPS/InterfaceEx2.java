package KunalOOPS;

interface Student {
    void studentData();
}

class Avi implements Student {

    static void Data() {
        int id = 01;
        String name = "Hrithik";
        System.out.println(id);
        System.out.println(name);
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        // Avi ob1 = new Avi();
        // ob1.Data();
        Avi.Data();
    }
}
