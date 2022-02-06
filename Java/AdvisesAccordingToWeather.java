package TestingPack;

import java.util.Scanner;

public class AdvisesAccordingToWeather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperature;
        System.out.println("Enter temperature: ");
        temperature = input.nextFloat();

        if (temperature < 5)
            System.out.println("You can go skiing.");
        else if (temperature >= 5 && temperature < 15)
            System.out.println("You can go to the cinema.");
        else if (temperature >= 15 && temperature < 25)
            System.out.println("You can go to picnic.");
        else
            System.out.println("You can go swimming.");

        input.close();
    }
}