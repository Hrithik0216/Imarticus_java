package ClassObjects;

class second {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
}

public class GetSet {
    public static void main(String[] args) {
        second myObj = new second();

        myObj.setName("Hrithik");
        System.out.println("My name is " + myObj.getName());

    }

}
 