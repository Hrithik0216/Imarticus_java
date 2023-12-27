package Recursion_for_Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        System.out.println(subSeqCount(p, up));
    }

    static void subSeq(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));

    }

    static ArrayList<String> subSeqList(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!p.isEmpty()) {
                list.add(p);
            }

            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));
        left.addAll(right);
        return left;

    }

    static int subSeqCount(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            if (!p.isEmpty()) {
                list.add(p);
            }

            return list.size();
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));
        left.addAll(right);
        return left.size();

    }
}
