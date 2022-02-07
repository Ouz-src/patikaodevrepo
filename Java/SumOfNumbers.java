package TestingPack;

import java.util.Scanner;

public class AverageOfDividableNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        while (n % 2 != 1) {
            System.out.print("\nEnter a number: ");
            try {
                n = input.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong input!");
                break;
            }
            if (n % 4 == 0)
                sum += n;
        }
        System.out.println("Sum of numbers dividable by 4: " + sum);
    }
}