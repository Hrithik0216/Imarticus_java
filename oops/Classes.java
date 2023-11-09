package oops;

public class Classes {
    String name; //State variables or fields and calles as template
    int id;
    int roll_num;
    int age;

    public void Print(){
        System.out.println(name);
        System.out.println(roll_num);
        System.out.println(age);
    }
    
    public static void main(String[] args) {
        Classes myObj = new Classes();
        myObj.name = "Hrithik"; // First instance of the defined class
        myObj.roll_num=19;
        myObj.age=21;
        myObj.Print();
    }
}
