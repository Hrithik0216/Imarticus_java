package Pattern;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice, amount, balance = 20000;
        char ch;
        do {
            System.out.println("1.Withdraw: ");
            System.out.println("2.Deposit: ");
            System.out.println("3.Checkbalance: ");
            System.out.println("4.Exit: ");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    amount = s.nextInt();
                    balance = balance - amount;
                    System.out.print("Blance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    amount = s.nextInt();
                    balance = balance + amount;
                    System.out.println("Deposited: " + balance);
                    break;
                case 3:
                    System.out.print("The balance amount is: ");
                    amount = s.nextInt();
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
            System.out.println();
            System.out.print("Do you want to continue? Y or N ");
            ch = s.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        System.out.println("Thank you for the service");
    }

}
