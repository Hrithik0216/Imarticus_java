package WeekendPractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class FindDuplicate {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();
        char[] inp = s.toLowerCase().toCharArray();
        Set<Character> duplicateSet = new HashSet<>();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (inp[i] == inp[j] && !duplicateSet.contains(inp[i])) {
                    System.out.print(inp[j]+" , ");
                    duplicateSet.add(inp[i]);
                    cnt++;
                    break;
                }
            }
        }
    }
}