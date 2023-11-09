package String;

public class String2 {
    public static void main(String[] args) {
        String str = "Hrithik";
        String str2 = "Hrithik";
        String str3 = new String("hrithik");
        Object objStr = str;
        String orgString = "Hello world ,Hello Reader";
        int lastIndexOf = orgString.lastIndexOf("Hello"); //if the word is not found lastIndexOf value will be -1
        
        String contained = "Hello world";
        System.out.print("check if it contains: "+contained.contains("Hello"));
        System.out.println();

        //We can reverse a string by converting stringClass to stringBuffer or StringBuilder class 
        //Or with the same string class we can reverse converting it into char[] 
        String beforeReverse = "Malaysia";
        String reverse = new StringBuffer(beforeReverse).reverse().toString();
        System.out.print("Original: "+beforeReverse);
        System.out.println();
        System.out.print("reversed: "+reverse);
        System.out.println();

        char[] try1 = beforeReverse.toCharArray();
        for(int i = try1.length-1;i>=0;i--){
            System.out.print("Reversed String: "+try1[i]);
        }
        System.out.println();

        
        
        if(lastIndexOf==-1){
            System.out.println("hello not found");
        }else{
                System.out.println("last occurence of hello is at index "+ lastIndexOf);

        }

        System.out.println(str.compareTo(str2)); //ASCII value comparision between 2 strings
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.compareTo(objStr.toString()));

        System.out.println(str.equals(str2)); // (.equals)compare the values
        System.out.println(str==str2); // (==) compare values and datatypes
        System.out.println(str.equals(str3)); 
        System.out.println(str==str3);
    }
}
