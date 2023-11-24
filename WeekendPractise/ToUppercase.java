package WeekendPractise;

import java.util.Scanner;
class Hrithik{
    public String changeCase(String s) {
        char ch = ' ';
        String newName = "";
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ch = (char) (s.charAt(i) - 32);
                newName+=ch;

            } else {
                ch = (s.charAt(i));
                newName+=ch;
            }
        return newName;
    }
}

public class ToUppercase {

    

    public static void main(String[] args) {
        Hrithik ob1 = new Hrithik();
        String result = ob1.changeCase("HrhfssaqjjKK");
        System.out.println(result);

    }
}
