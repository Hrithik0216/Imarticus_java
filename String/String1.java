package String;



public class String1 {
    public static void main(String[] args) {
        String str = "Hrithik";
        //str.setLength(5); We cannot setLength in string class

        
        StringBuffer s = new StringBuffer("Hrithik");
        s.setLength(5);; //We can setLength in StringBuffer class
        System.out.println(s);
        
    }
}
