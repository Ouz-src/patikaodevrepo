package TestingPack;

import java.util.Scanner;

public class RecursivePrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (recursivePrimeNumbers(n, 2))
            System.out.printf("%d is a prime number!", n);
        else
            System.out.printf("%d is not a prime number!", n);

        input.close();
    }

    public static boolean recursivePrimeNumbers(int x, int i) {
        if (x < 2)
            return false;
        if (x == 2)
            return true;
        if (i == x)
            return true;
        if (x % i == 0)
            return false;

        return recursivePrimeNumbers(x, i + 1);
    }
}