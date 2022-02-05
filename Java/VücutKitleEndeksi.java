package TestingPack;

import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        float boy = input.nextFloat();
        System.out.print("\nLütfen kilonuzu giriniz: ");
        float kilo = input.nextFloat();
        float vkEndeksi = kilo/(boy*boy);
        System.out.print("\nVücut Kitle Endeksiniz: " + vkEndeksi);
        input.close();
    }   
}