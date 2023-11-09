package oops;

public class SetGet {
    String name; //State variables or fields and calles as template
    int id;
    int roll_num;
    int age;

    public void Print(){
        System.out.println(name);
        System.out.println(roll_num);
        System.out.println(age);
    }

    public void setValues(String str, int num, int num2, int num3){
        this.name = str;
        this.id = num;
        this.roll_num = num2;
        this.age = num3;

    }

    class main{
        public static void main(String[] args) {
        SetGet myUser1 = new SetGet();
        /*myUser1.name = "hrithik";
        myUser1.id = 19;
        myUser1.roll_num = 25;
        myUser1.age=21;*/
        myUser1.setValues("Hrithik", 1, 25, 22);
        myUser1.Print();

        SetGet myUser2= new SetGet();
        myUser2.name = "arun";
        myUser2.id = 2;
        myUser2.roll_num = 26;
        myUser2.age=22;
        myUser2.Print();
    }
    }
    
}
