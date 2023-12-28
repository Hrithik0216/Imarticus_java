package Recursion_for_Strings;

import java.util.ArrayList;
import java.util.Collection;

public class Permutations {
    public static void main(String[] args) {
        String up = "ab";
        String p = "";
        ArrayList<String> ans = permutateString(p, up);
        System.out.println(ans);
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

    static ArrayList<String> permutateString(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutateString(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
