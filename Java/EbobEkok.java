package TestingPack;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, range = 0, numK = 1, numB = 1, ebob = 0, ekok = 0;
        boolean minEkok = false;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        range = a <= b ? a : b;

        while (numK < range) {
            if (a % numK == 0 && b % numK == 0) {
                ebob = numK;
            }
            numK++;
        }

        while (numB <= a * b && !minEkok) {
            if (numB % a == 0 && numB % b == 0) {
                ekok = numB;
                minEkok = true;
            }
            numB++;
        }
        System.out.println("EBOB: " + ebob + "\nEKOK: " + ekok);
        input.close();
    }
}