package TestingPack;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;
        System.out.print("Your month of birth: ");
        month = input.nextInt();
        System.out.print("Your day of birth: ");
        day = input.nextInt();
        if ((day <= 31 && day > 0) && (month > 0 && month <= 12)) {
            if (month == 3) {
                if (day >= 21 && day <= 31)
                    System.out.println("Aries");
                else if (day < 21)
                    System.out.println("Pisces");
            }
            if (month == 4) {
                if (day <= 20)
                    System.out.println("Aries");
                else
                    System.out.println("Taurus");
            }
            if (month == 5) {
                if (day <= 21)
                    System.out.println("Taurus");
                else
                    System.out.println("Gemini");
            }
            if (month == 6) {
                if (day <= 23)
                    System.out.println("Gemini");
                else
                    System.out.println("Cancer");
            }
            if (month == 7) {
                if (day <= 22)
                    System.out.println("Cancer");
                else
                    System.out.println("Leo");
            }
            if (month == 8) {
                if (day <= 23)
                    System.out.println("Leo");
                else
                    System.out.println("Virgo");
            }
            if (month == 9) {
                if (day <= 23)
                    System.out.println("Virgo");
                else
                    System.out.println("Libra");
            }
            if (month == 10) {
                if (day <= 23)
                    System.out.println("Libra");
                else
                    System.out.println("Scorpio");
            }
            if (month == 11) {
                if (day < 22)
                    System.out.println("Scorpio");
                else
                    System.out.println("Sagittarius");
            }
            if (month == 12) {
                if (day < 22)
                    System.out.println("Sagittarius");
                else
                    System.out.println("Capricorn");
            }
            if (month == 1) {
                if (day < 22)
                    System.out.println("Capricorn");
                else
                    System.out.println("Aquarius");
            }
            if (month == 2) {
                if (day < 22)
                    System.out.println("Aquarius");
                else if (day > 22 && day <= 28)
                    System.out.println("Pisces");
                else
                    System.out.println("Wrong input!");
            }
        }
        input.close();
    }
}