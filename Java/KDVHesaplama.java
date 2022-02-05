package TestingPack;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float kdvOranı = 0.18f;
        float tutar;
        System.out.println("Ücreti giriniz: ");
        tutar = scanner.nextFloat();
        float kdvTutar = tutar*kdvOranı;
        float kdvliTutar = tutar + kdvTutar;
        System.out.printf("KDV'siz tutar: %.2f\n", tutar);
        System.out.printf("KDV oranı: %.2f\n", kdvOranı);
        System.out.printf("KDV tutarı: %.2f\n", kdvTutar);
        System.out.printf("KDV'li tutar: %.2f\n", kdvliTutar);

        scanner.close();
    }
}