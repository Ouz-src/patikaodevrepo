package TestingPack;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n)
            System.out.printf("%d is a perfect number!", n);
        else
            System.out.printf("%d is not a perfect number!", n);
        input.close();
    }
}