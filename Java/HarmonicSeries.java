package TestingPack;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float harmonicSum = 0;
        for (int i = 1; i <= n; i++)
            harmonicSum += 1.0 / i;

        System.out.println(harmonicSum);
        input.close();
    }
}