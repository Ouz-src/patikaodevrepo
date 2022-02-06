package TestingPack;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.printf("\n%d is a leap year!", year);
                else
                    System.out.printf("\n%d is not a leap year!", year);
            } else {
                System.out.printf("\n%d is a leap year!", year);
            }
        } else {
            System.out.printf("\n%d is not a leap year!", year);
        }

        input.close();
    }
}