package WeekendPractise;

class Find {
    public int findPosition(String s, Character ch) {
//System.out.println(s.split(" ").toString().indexOf(ch));
        

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) == ch) {
                    return i;
                }
            }

        }
        return -1;
    }
}

public class FindIndexPosition {
    public static void main(String[] args) {
        Find ob1 = new Find();
    
        System.out.println(ob1.findPosition("Hrithik", 'a'));
    }
}
