package TestingPack;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element quantity of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d. number: ", i + 1);
            arr[i] = input.nextInt();
        }
        Sort(arr);
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        input.close();
    }

    // Bubble Sort Algorithm
    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
