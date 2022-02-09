package TestingPack;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int b = input.nextInt();
        System.out.print("Enter power number: ");
        int p = input.nextInt();
        System.out.printf("%d^%d is: %d", b, p, pow(b, p));
        input.close();
    }

    public static int pow(int b, int p) {
        if (p == 1)
            return b;
        if (p == 0)
            return 1;
        return b * pow(b, p - 1);
    }

}