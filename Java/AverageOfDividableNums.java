package TestingPack;

import java.util.Scanner;

public class JavaEdu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0, numCount = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                numCount++;
                sum += i;
            }
        }

        try {
            var average = sum / (numCount - 1);
            System.out.println("Average: "+ average);
        } catch (Exception e) {
            System.out.println("None of the numbers are dividable by 3 and 4");
        }
    }
}