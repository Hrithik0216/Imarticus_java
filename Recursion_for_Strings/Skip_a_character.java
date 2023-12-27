package Recursion_for_Strings;

public class Skip_a_character {
    public static void main(String[] args) {
        String p = "";
        String up = "bccaad";
        String apple = "dbappltt";
        skip(p, up);
        System.out.println(skip(up));
        System.out.println(skipApple(apple));
        System.out.println(skipAppNotApple(apple));
    }
    //Skip a charcter
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return skip(up.substring(1));
        }else{
            return ch +skip(up.substring(1));
        }
    }

    //Skip a sentence
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
           return skipApple(up.substring(5));
        }else{
            return ch +skipApple(up.substring(1));
        }
    }

    //Skip a sentence
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("app")&& !up.startsWith("apple")){
           return skipAppNotApple(up.substring(3));
        }else{
            return ch +skipAppNotApple(up.substring(1));
        }
    }
}
