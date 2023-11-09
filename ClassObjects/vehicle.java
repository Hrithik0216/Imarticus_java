package ClassObjects;

public class vehicle {
    class car{
        protected String brand = "Ford";
        public String sound = "Tut tut";
    }

    class model extends car{
        private String model= "Mustang";
    }
    public static void main(String[] args) {
        vehicle myObj = new vehicle();
        System.out.println(myObj.model+ myObj.brand);
        
    }
}
