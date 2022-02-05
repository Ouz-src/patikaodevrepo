package TestingPack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);
        matematik = scanner.nextFloat();
        fizik = scanner.nextFloat();
        kimya = scanner.nextFloat();
        turkce = scanner.nextFloat();
        tarih = scanner.nextFloat();
        muzik = scanner.nextFloat();
        System.out.printf("Matematik notu: %.2f\n", matematik);
        System.out.printf("Fizik notu: %.2f\n", fizik);
        System.out.printf("Kimya notu: %.2f\n", kimya);
        System.out.printf("Türkçe notu: %.2f\n", turkce);
        System.out.printf("Tarih notu: %.2f\n", tarih);
        System.out.printf("Müzik notu: %.2f\n", muzik);
        float toplam = matematik+fizik+kimya+turkce+tarih+muzik;
        System.out.println("Ortalama: "+ toplam/6);
        String sonuc = toplam/6 >= 60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
        scanner.close();
    }
}