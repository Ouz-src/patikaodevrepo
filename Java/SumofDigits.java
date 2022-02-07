package TestingPack;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        short sum = 0;
        while (n % 10 > 0) {
            sum += n%10; 
            n/= 10;
        }
        System.out.println(sum);
        input.close();
    }
}