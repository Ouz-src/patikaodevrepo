package TestingPack;

import java.util.Scanner;

public class OrderNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        System.out.println("Enter the third number");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b < c)
                System.out.printf("%d < %d < %d", a, b, c);
            else
                System.out.printf("%d < %d < %d", a, c, b);
        } else if (b < a && b < c) {
            if (a < c)
                System.out.printf("%d < %d < %d", b, a, c);
            else
                System.out.printf("%d < %d < %d", b, c, a);
        } else if (c < a && c < b) {
            if (b < a)
                System.out.printf("%d < %d < %d", c, b, a);
            else
                System.out.printf("%d < %d < %d", c, a, b);
        }

        input.close();
    }
}