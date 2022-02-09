package TestingPack;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        MainMenu();
    }

    static void MainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Please select an operation:\n1-Summation\n2-Subtraction\n3-Multiplication\n4-Dividation\n5-Power\n6-Factorial\n7-Finding the remainder\n8-Calculate area of a rectangle\n9-Calculate circumference of a rectangle");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.print("Enter first number: \n");
                int sA = input.nextInt();
                System.out.println("Enter second number: ");
                int sB = input.nextInt();
                System.out.println("Result is: " + summation(sA, sB));
                break;
            case 2:
                System.out.print("Enter first number: \n");
                int suA = input.nextInt();
                System.out.println("Enter second number: ");
                int suB = input.nextInt();
                System.out.println("Result is: " + subtraction(suA, suB));
                break;
            case 3:
                System.out.print("Enter first number: \n");
                int mA = input.nextInt();
                System.out.println("Enter second number: ");
                int mB = input.nextInt();
                System.out.println("Result is: " + multiplication(mA, mB));
                break;
            case 4:
                System.out.print("Enter first number: \n");
                int dA = input.nextInt();
                System.out.println("Enter second number: ");
                int dB = input.nextInt();
                System.out.println("Result is: " + dividation(dA, dB));
                break;
            case 5:
                System.out.print("Enter base number: \n");
                int base = input.nextInt();
                System.out.println("Enter power number: ");
                int power = input.nextInt();
                System.out.println("Result is: " + pow(base, power));
                break;
            case 6:
                System.out.print("Enter a number: \n");
                int fac = input.nextInt();
                System.out.println("Result is: " + factorial(fac));
                break;
            case 7:
                System.out.print("Enter dividend: \n");
                int divA = input.nextInt();
                System.out.println("Enter divisor: ");
                int divB = input.nextInt();
                System.out.println("Result is: " + remainder(divA, divB));
                break;
            case 8:
                System.out.print("Enter first edge length: ");
                int eA = input.nextInt();
                System.out.print("Enter second edge length: ");
                int eB = input.nextInt();
                System.out.println("Result is: " + area(eA, eB));
                break;
            case 9:
                System.out.print("Enter first edge length: ");
                int cA = input.nextInt();
                System.out.print("Enter second edge length: ");
                int cB = input.nextInt();
                System.out.println("Result is: " + circumference(cA, cB));
                break;
            default:
                System.out.println("Wrong input!");
                MainMenu();
                break;
        }
        input.close();
    }

    public static int summation(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int dividation(int a, int b) {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Cannot divide by 0!");
            return -1;
        }
    }

    public static int pow(int b, int p) {
        if (p == 1)
            return b;
        if (p == 0)
            return 1;
        return b * pow(b, p - 1);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static int area(int a, int b) {
        return a * b;
    }

    public static int circumference(int a, int b) {
        return 2 * (a + b);
    }
}
