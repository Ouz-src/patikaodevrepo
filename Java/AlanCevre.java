package TestingPack;

import java.util.Scanner;

public class AlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r = 0;
        final float PI = 3.14f;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextFloat();
        float alan= PI*r*r;
        float cevre = 2*PI*r;
        System.out.println("Alan: "+ alan);
        System.out.println("Çevre: "+ cevre);
    }
}