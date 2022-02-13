package TestingPack;

public class RepeatingNumsInArr {
    public static void main(String[] args) {
        int[] numbers = { 4, 3, 6, 4, 5, 8, 12, 42, 34, 2, 6, 3, 7, 3, 1 };
        int[] evenRepeaters = new int[numbers.length];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[j] == numbers[i])
                    if (numbers[j] % 2 == 0 && !hasAlready(evenRepeaters, numbers[j]))
                        evenRepeaters[index++] = numbers[j];
            }
        }

        for (int i : evenRepeaters) {
            if (i != 0)
                System.out.println(i);
        }
    }

    static boolean hasAlready(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }

        return false;
    }
}
