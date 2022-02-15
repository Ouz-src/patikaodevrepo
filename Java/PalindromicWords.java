package TestingPack;

import java.util.Scanner;

public class PalindromicWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        if (isPalindromic(in))
            System.out.println(in + " is a palindromic word!");
        else
            System.out.println(in + " is not a palindromic word!");
        input.close();
    }

    static boolean isPalindromic(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed word: " + reverse);
        if (reverse.equals(str))
            return true;
        else
            return false;
    }
}
