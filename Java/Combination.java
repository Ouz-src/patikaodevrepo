package TestingPack;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, r = 0, fac_N = 1, fac_NR = 1, fac_R = 1;
        System.out.println("Combination formula: n!/((n-r)!*r!)");
        System.out.print("Enter the value of n: \n");
        n = input.nextInt();
        System.out.print("Enter the value of r: \n");
        r = input.nextInt();

        for (int i = 1; i <= n; i++)
            fac_N *= i;

        for (int i = 1; i <= (n - r); i++)
            fac_NR *= i;

        for (int i = 1; i <= r; i++)
            fac_R *= i;

        var result = fac_N / (fac_NR * fac_R);
        if (n < r)
            System.out.println("n cannot be lower than r!");
        else
            System.out.printf("Value of the combination is: %d", result);

        input.close();
    }
}