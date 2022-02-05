package TestingPack;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = scanner.nextInt();
        float tutar = km * 2.2f < 20 ? 20 : km * 2.2f;
        byte acilisUcreti = 10;
        float toplamTutar = tutar+acilisUcreti;
        System.out.println(toplamTutar+" TL");
        scanner.close();
    }
}