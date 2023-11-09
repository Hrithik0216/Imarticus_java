package CharacterMethods;

import java.util.Scanner;

public class FirstPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String a = s.nextLine();
        char ch[] = a.toCharArray();
        int vowel = 0, capital = 0, consonant = 0, lower = 0, whiteSpace = 0, specialChar = 0, digit = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i]) || Character.isDigit(ch[i]) || Character.isWhitespace(ch[i])) {
                if ((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                        ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') && (vowel == 0)) {
                    vowel = i + 1;
                } else if (consonant == 0) {
                    consonant = i + 1;
                }
                
                if (capital == 0 && Character.isUpperCase(ch[i])) {
                    capital = i + 1;
                }
                if (lower == 0 && Character.isLowerCase(ch[i])) {
                    lower = i + 1;
                }
                if (whiteSpace == 0 && Character.isWhitespace(ch[i])) {
                    whiteSpace = i + 1;
                }
                if (digit == 0 && Character.isDigit(ch[i])) {
                    digit = i + 1;
                }
            } else if (specialChar == 0) {
                specialChar = i + 1;
            }

        }

        System.out.println("Vowel: " + vowel);
        System.out.println("Consonant: " + consonant);
        System.out.println("Capital: " + capital);
        System.out.println("WhiteSpace: "+ whiteSpace);
        System.out.println("Special Character: " + specialChar);
        System.out.println("Digit: " + digit);

    }

}
