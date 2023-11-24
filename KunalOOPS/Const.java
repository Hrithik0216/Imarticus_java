package KunalOOPS;

public class Const {
    String name;
    Long id;
    int age;

    //Constructor
    Const(String name, Long id){
        this.name = name;
        this.id = id;
        System.out.println("Constructor is called");
        System.out.println("My id is "+id+" name is "+name);
    }
    Const(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor is called");
        System.out.println("My age is "+age+" name is "+name);
    }
    //copy constructor
    Const(Const obj){
        this.name = obj.name;
        this.age = obj.age;
        this.id = obj.id;
    }
    public static void main(String[] args) {
        Const ob1 = new Const("Hrithik", 1);
        Const ob2 = new Const("HRithik", 2);
        Const ob2 = new Const(ob1);
        System.out.println("name: "+ob2.name+" age: "+ob2.age);
    }
}
