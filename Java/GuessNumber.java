package TestingPack;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);
        System.out.println("Secret Number: " + number);
        int right = 5, selection = -1;
        int[] guesses = new int[5];
        System.out.println("Rights: " + right);

        while (selection != number && right > 0) {
            if (selection >= -1 && selection <= 100) {
                System.out.println("Please enter a number between 0-100");
                selection = input.nextInt();
                System.out.println("-------------------------------------");
                if (selection == -1) {
                    System.out.println("Wrong input! You have to choose a number between 0-100");
                    break;
                }
                guesses[right - 1] = selection;
                right--;
                if (right != 0)
                    System.out.println("Rights: " + right);
                if (selection < number) {
                    System.out.println("Secret number is bigger than your guess.");
                } else if (selection > number) {
                    System.out.println("Secret number is smaller than your guess.");
                }
            } else {
                System.out.println("Wrong input! You have to choose a number between 0-100");
            }
        }
        if (selection == number && right >= 0) {
            if (right != 0)
                System.out.println("-------------------------------------");
            System.out.println("You Won!\nYour Guesses: ");
            for (int i : guesses) {
                if (i != 0)
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("-------------------------------------");
            System.out.println("You Failed! The number was: " + number + "\nYour Guesses: ");
            for (int i : guesses) {
                if (i != 0)
                    System.out.print(i + " ");
            }
        }
        input.close();
    }
}
