package KunalOOPS;


class Hrithik {
    int age;
    String lastName;
    
    
    public void setLastName(String lName){
        this. lastName = lName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setAge(int age){
         this.age = age;
    } 
    public int getAge(){
        return age;
    }
    
    
   /* Hrithik(int ag, String lastNam){
        this.age = ag;
        this. lastName = lastNam;
    } */

}
public class Encapsulation {
    public static void main(String[] args) {
       // Hrithik ob1 = new Hrithik(0, null);
       Hrithik ob1 = new Hrithik();
       ob1.setAge(20);
       ob1.setLastName("Arun");
       System.out.println(ob1.getLastName());
       System.out.println(ob1.getLastName());
       
    }
}
