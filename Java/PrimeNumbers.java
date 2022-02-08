package TestingPack;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            var notPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime)
                System.out.println(i);
        }
    }
}