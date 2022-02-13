package TestingPack;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int minClosest = list[0];
        int maxClosest = list[0];
        Arrays.sort(list);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        for (int i : list) {
            if (i < number)
                minClosest = i;
        }
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] > number)
                maxClosest = list[i];
        }
        System.out.println("Biggest number smaller than input number: " + minClosest);
        System.out.println("Smallest number bigger than input number: " + maxClosest);
        input.close();
    }
}
