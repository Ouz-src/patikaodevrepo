package TestingPack;

import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = input.nextInt();
        if (isPalindrom(n))
            System.out.printf("%d is a palindrom number!", n);
        else
            System.out.printf("%d is not a palindrom number!", n);
        input.close();
    }

    static boolean isPalindrom(int n) {
        int temp = n, reversedNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reversedNumber == n)
            return true;
        else
            return false;
    }
}