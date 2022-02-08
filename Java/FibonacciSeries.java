package TestingPack;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int previousNum = 0, nextNum = 1;
        System.out.print("Enter element count for fibonacci series: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1)
                System.out.print(0+" ");
            else if (i < 3) {
                var result = previousNum + nextNum;
                System.out.print(result+" ");
            } else {
                var result = previousNum + nextNum;
                System.out.print(result+" ");
                previousNum = nextNum;
                nextNum = result;
            }
        }
        input.close();
    }
}