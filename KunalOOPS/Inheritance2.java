package KunalOOPS;

class Variables {
    String s;

    public Variables(String sentence) {
        this.s = sentence;
    }

    public String palindromeCheck() {
        //s= "test";
        return "";
    }
}

class Logic extends Variables {

    public Logic(String sentence) {
        super(sentence);
    }

    @Override
    public String palindromeCheck(){
        super.palindromeCheck();
        String str = this.s;
        String rev = "";
        int len = str.length();
        for(int i=(len-1);i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.toLowerCase().equals(rev.toLowerCase())){ //we use .equals because it is used to compare the content at different mempry location, Whereas == checks if they refer to same memory location
           return "it is a palindrome";
        }else{
            return "It is not a palindrome";
        }
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Logic ob1 = new Logic("racecar");
        System.out.println(ob1.palindromeCheck());
    }
}
