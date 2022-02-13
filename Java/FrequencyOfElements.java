package TestingPack;

import java.util.Arrays;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        frequency(arr);
    }

    static void frequency(int[] arr) {
        boolean counted[] = new boolean[arr.length];
        Arrays.fill(counted, false);

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;

            if (counted[i])
                continue;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counted[j] = true;
                    counter++;
                }
            }
            System.out.println("Number " + arr[i] + " repeated " + counter + " times.");
        }
    }
}
