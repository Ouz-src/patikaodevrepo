package TestingPack;

import java.util.Scanner;

public class MavanKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float armutKgFiyat = 2.14f, elmaKgFiyat = 3.67f, domatesKgFiyat = 1.11f, muzKgFiyat = 0.95f,
                patlıcanKgFiyat = 5;
        System.out.println("Armut kaç kilo?");
        float armutTutar = input.nextFloat() * armutKgFiyat;
        System.out.println("Elma kaç kilo?");
        float elmaTutar = input.nextFloat() * elmaKgFiyat;
        System.out.println("Domates kaç kilo?");
        float domatesTutar = input.nextFloat() * domatesKgFiyat;
        System.out.println("Muz kaç kilo?");
        float muzTutar = input.nextFloat() * muzKgFiyat;
        System.out.println("Patlıcan kaç kilo?");
        float patlıcanTutar = input.nextFloat() * patlıcanKgFiyat;
        float toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlıcanTutar;
        System.out.println("Toplam Tutar: " + toplamTutar + "TL");
        input.close();
    }
}