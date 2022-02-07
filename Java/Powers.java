package TestingPack;

import java.util.Scanner;

public class PowersofTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 4, k = 1; i <= n; i *= 4, k++) {
            System.out.printf("%d. power of 4: %d\n", k, i);
        }
        System.out.println("*************");
        for (int j = 5, m = 1; j <= n; j *= 5, m++) {
            System.out.printf("%d. power of 5: %d\n", m, j);
        }
        input.close();
    }
}