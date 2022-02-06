package TestingPack;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;
        while (loggedIn == false) {
            String userName = "oguz", password = "123456";
            System.out.println("Please enter your Username.");
            String tempUserName = input.nextLine();
            System.out.println("Please enter your Password.");
            String tempPassword = input.nextLine();
            if (tempUserName.equals(userName) && tempPassword.equals(password)) {
                System.out.println("Logged in succesfully!");
                loggedIn = true;
            } else {
                System.out.println("Username or password is incorrect! Please try again!");
            }
        }

        input.close();
    }
}
