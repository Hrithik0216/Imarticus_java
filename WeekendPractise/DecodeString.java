package WeekendPractise;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "100[d]3[a]";
        String result = decode(s);
        System.out.println(result);
    }

    public static String decode(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> ch = new Stack<>();
        int i = 0;
        String res = "";

        while (i < s.length()) {
            char curr = s.charAt(i);

            if (Character.isDigit(curr)) {
                int n = 0;
                while (Character.isDigit(s.charAt(i))) {
                    n = n * 10 + (s.charAt(i) - '0');
                    i++;
                }
                num.push(n);
            } else if (curr == '[') {
                ch.push(res);
                res = "";
                i++;
            } else if (curr == ']') {
                StringBuilder sb = new StringBuilder();
                sb.append(ch.pop());
                int count = num.pop();
                for (int j = 0; j < count; j++) {
                    sb.append(res);
                }
                res = sb.toString();
                i++;
            } else {
                res += curr;
                i++;
            }
        }

        return res;
    }

}
