package TestingPack;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0, p = 0, result = 1;
        System.out.print("Enter base: ");
        b = input.nextInt();
        System.out.print("Enter power: ");
        p = input.nextInt();
        for (int i = p; i > 0; i--) {
            result *= b;
        }
        System.out.println(result);
        input.close();
    }
}