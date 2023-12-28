package Recursion_for_Strings;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        permutatePrint(p, up);
    }

    static void permutatePrint(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutatePrint(f + ch + s, up.substring(1));
        }
    }
}
