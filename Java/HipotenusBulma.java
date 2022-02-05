package TestingPack;

import java.util.Scanner;
import java.lang.Math;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        double c = 0;
        System.out.print("İlk kenarın değerini giriniz: ");
        a = scanner.nextInt();
        System.out.print("\nİkinci kenarın değerini giriniz: ");
        b = scanner.nextInt();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("\nHipotenüs'ün değeri: %.2f", c);

        scanner.close();
    }
}