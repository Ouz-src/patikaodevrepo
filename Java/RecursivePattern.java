package TestingPack;

import java.util.Scanner;

public class RecursivePattern {
    static int firstValue;
    static int lastValue;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        firstValue = n;
        System.out.print("Output: ");
        int lastNum = recursivePatternDecrease(n);
        recursivePatternIncrease(lastNum);
        input.close();
    }

    static int recursivePatternDecrease(int x) {
        System.out.print(x + " ");
        if (x <= 0) {
            lastValue = x;
            return x;
        }
        return recursivePatternDecrease(x - 5);
    }

    static int recursivePatternIncrease(int x) {
        if (x != lastValue)
            System.out.print(x + " ");
        if (x == firstValue)
            return x;

        return recursivePatternIncrease(x + 5);
    }
}