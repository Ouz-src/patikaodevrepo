package TestingPack;

import java.util.Scanner;

public class FindMinMaxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNum = 0, minNum = 0;
        System.out.println("How many numbers you want to type?");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.printf("Type the %d. number: ", i + 1);
                var a = input.nextInt();
                maxNum = a;
                minNum = a;
            } else {
                System.out.printf("Type the %d. number: ", i + 1);
                var num = input.nextInt();
                if (maxNum < num)
                    maxNum = num;

                if (minNum > num)
                    minNum = num;
            }
        }

        System.out.println("Maximum number: " + maxNum + "\n" + "Minimum number: " + minNum);
        input.close();
    }
}