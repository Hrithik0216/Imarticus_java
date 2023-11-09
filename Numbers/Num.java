package Numbers;

public class Num {
    public static void main(String[] args) {

        //In Java, a wrapper class is a class that encapsulates (wraps) 
        //the primitive data types (e.g., int, float, char) in an object.
        //Wrapper classes provide a way to work with primitive data types as objects, allowing you to 
        //access various utility methods and leverage Java's object-oriented features.
        
        
        //To convert one datatype to another we use
        //Class Objects
        Integer x = 10;
        Float f = x.floatValue();
        System.out.println(f);

        //String to Integer
        String str = "123";
        Integer y = Integer.valueOf(str);
        System.out.print("String to Integer:"+y);
        System.out.println();

        //Integer to string
        System.out.print("Integer to String: "+ String.valueOf(y));

        //Other number methods
        System.out.print(Math.abs(10-20));
        System.out.print(Math.ceil(8.5));
        System.out.print(Math.floor(8.5));
        System.out.print(Math.round(8.5));

        //compareTo() and equalTo()
        Integer a = 10;
        Integer b = 20;
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));

        String A = "Arun";
        String B = "Arun";
        if(A.equals(B))
        System.out.println("Both Strings are equal");
        if(A.compareTo(B)==0);
        System.out.println("Bothe Strings are equal");


        
    }
}
