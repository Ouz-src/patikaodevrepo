package TestingPack;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean girisYapıldı = false;
        while (girisYapıldı == false) {
            String userName = "oguz", password = "123456";
            System.out.println("Lütfen Kullanıcı adınızı giriniz.");
            String tempUserName = input.nextLine();
            System.out.println("Lütfen Şifrenizi giriniz.");
            String tempPassword = input.nextLine();
            if (tempUserName.equals(userName) && tempPassword.equals(password)) {
                System.out.println("Giriş başarılı!");
                girisYapıldı = true;
            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış. Lütfen tekrar deneyiniz!");
            }
        }

        input.close();
    }
}