package TestingPack;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int harmonicSum = 0;
        for (int i = 0; i < numbers.length; i++)
            harmonicSum += 1/numbers[i];

        System.out.println(numbers.length/harmonicSum);
    }
}
