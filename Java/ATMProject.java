package TestingPack;

import java.util.Scanner;

import javax.swing.text.html.parser.Entity;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int entriesLeft = 3;
        int selection = 0;
        int balance = 4259;
        while (entriesLeft > 0 && selection != 4) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();
            if (userName.equals("oguz") && password.equals("1234")) {
                System.out.println("Welcome to the Karadeniz Bank!");
                do {
                    System.out.println(
                            "Choose an operation:\n1-Deposit Money\n2-Withdraw Money\n3-Inquire Balance\n4-Exit");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Enter money amount you want to deposit: ");
                            int amountD = input.nextInt();
                            if (amountD < 0) {
                                System.out.println("Wrong input!");
                            } else {
                                balance += amountD;
                                System.out.println("Transaction successfully completed.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter money amount you want to withdraw: ");
                            int amountW = input.nextInt();
                            if (amountW < 0) {
                                System.out.println("Wrong input!");
                            } else {
                                balance -= amountW;
                                System.out.println("Transaction successfully completed.");
                            }
                            break;
                        case 3:
                            System.out.printf("Current balance: %d\n", balance);
                            break;
                        case 4:
                            System.out.println("Logged out. Goodbye!");
                            break;
                        default:
                            System.out.println("Wrong Input!");
                            break;
                    }
                } while (selection != 4);
            } else {
                entriesLeft--;
                System.out.println("Username or password incorrect. Please try again!");
            }
        }

        if (entriesLeft <= 0)
            System.out.println("Your account has been blocked! Please contact your bank.");

        input.close();
    }
}