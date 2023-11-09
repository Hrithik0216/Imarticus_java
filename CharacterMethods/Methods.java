package CharacterMethods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /*
         * System.out.println(Character.toUpperCase('a'));
         * System.out.println(Character.toLowerCase('A'));
         * System.out.println(Character.toString('a'));
         */
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        String a = s.nextLine();
        int digit = 0;
        int alph = 0;
        int space = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int vowel = 0;
        int consonant = 0;
        int specialCh=0;
        char ch[] = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                alph++;
            }
            //For vowel
            if (Character.isLetter(ch[i])) {
                alph++;
                if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                        ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
            }else if(Character.isDigit(ch[i])){
                digit++;
            }else{
                specialCh++;
            }

            if (Character.isDigit(ch[i])) {
                digit++;
            }

            if (a.charAt(i) == ' ') {
                space++;
            }
            if (Character.isWhitespace(ch[i])) {
                space++;
            }

            if (Character.isLowerCase(ch[i])) {
                lowerCase++;
            }

            if (Character.isUpperCase(ch[i])) {
                upperCase++;
            }

        }
        System.out.println("output: ");
        System.out.println("Digits: " + digit);
        System.out.println("vowels: " + vowel);
        System.out.println("SPecial: "+ specialCh);
        System.out.println("Consonants: " + consonant);
        System.out.println("Alphabets: " + alph);
        System.out.println("Space: " + space);
        System.out.println("White Space: " + space);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Uppercase: " + upperCase);

    }
}
//Change other if to else if to accurately find special characters
