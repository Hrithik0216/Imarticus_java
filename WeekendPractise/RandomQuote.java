package WeekendPractise;

import java.util.Scanner;

public class RandomQuote {
    private static final char[][] String = null;

    public static void main(String[] args) {
        String[] fruits = {
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon",
                "mango", "nectarine", "orange", "pear", "quince",
                "raspberry", "strawberry", "tangerine", "uva", "violet",
                "watermelon", "xigua", "yellow", "zucchini",
                "elephant", "giraffe", "hippopotamus", "iguana", "jaguar",
                "koala", "lemur", "macaw", "narwhal", "ocelot",
                "penguin", "quokka", "raccoon", "sloth", "toucan",
                "umbrellabird", "vulture", "walrus", "x-raytetra", "yeti",
                "zebra", "axolotl", "butterfly", "cactus", "dolphin"
        };
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        for (int i = 0; i < number; i++) {
            int index = (int) (Math.random()*10 );
            System.out.println(fruits[index]);
        }
    }
}
