package TestingPack;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int in = input.nextInt();
        System.out.println("Fibonacci series of " + in + " elements: " + recursiveFibonacci(in));
        input.close();
    }

    public static int recursiveFibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}