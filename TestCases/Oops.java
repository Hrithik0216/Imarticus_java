package TestCases;

public class Oops {
    int x = 5;
    final String fName = "Hrithik";
    String lName = "arun";
    public static void main(String[] args) {
        Oops myObj1 = new Oops();
        myObj1.x = 25;
        System.out.println(myObj1.x);
        System.out.println("My name is "+ myObj1.fName+" "+ myObj1.lName);
        
    }
}
