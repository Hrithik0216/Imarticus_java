import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;


public class test {

    public static void main(String[] args) {
       
        String[] sString = {"BMW", "FORD"};
        String[] sNewString = new String[2];

        sString[0] = "Audi";
        // sString[3] = "Audi";

        sNewString[0] = "BMW";
        sNewString[1] = "Ford";
        // sNewString[2] = "Audi";

        LinkedList <String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Tata");
        cars.add(1, "Ford");
        cars.forEach(t ->  System.out.println(t));

        List <String> nums = new ArrayList<>();
    

        







        // cars.add("BMW");
        // cars.addFirst("Ford");
        // nums.add(2);
        // nums.
        // int i = nums.size();
        // System.out.println(i);

    }
}


