package TestingPack;

import java.util.Scanner;

public class JavaEdu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        System.out.println("Yapmak istediğiniz işlem:");
        System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Toplama işleminin cevabı: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin cevabı: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminin cevabı: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0)
                    System.out.println("Bölme işleminin cevabı: " + (n1 / n2));
                else
                    System.out.println("Payda 0 olamaz!");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
        }

        input.close();
    }
}