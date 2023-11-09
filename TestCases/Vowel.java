package TestCases;

import java.util.Scanner;

public class Vowel {
  public static void main(String[] args) {
    Scanner b = new Scanner(System.in);
    System.out.println("Enter the string: ");
    char v = b.next().charAt(0);
    switch (v) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("It starts with a vowel");
        break;
      default:
        System.out.println("It does not start with a vowel");
    }
  }
}
