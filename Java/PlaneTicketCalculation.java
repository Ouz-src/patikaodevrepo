package TestingPack;

import java.util.Scanner;

public class PlaneTicketCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ticketType -> One way/Round trip flight | dist -> Distance
        int dist, age, ticketType;
        float ageDiscountRate = 0, ticketTypeDiscountRate = 0, discount = 0, normalPrice = 0, totalPrice = 0;
        boolean wrongInput = false;
        System.out.print("Type your age: ");
        age = input.nextInt();
        System.out.print("Type travel distance: ");
        dist = input.nextInt();
        System.out.println("Choose your ticket type: (1) One way (2) Round Trip");
        ticketType = input.nextInt();
        if (dist < 0 || age < 0 || (ticketType > 2 || ticketType < 1)) {
            System.out.println("Wrong input!");
            wrongInput = true;
        }
        if (!wrongInput) {
            if (age < 12)
                ageDiscountRate = 0.5f;
            else if (age >= 12 && age <= 24)
                ageDiscountRate = 0.1f;
            else if (age > 65)
                ageDiscountRate = 0.3f;

            if (ticketType == 2)
                ticketTypeDiscountRate = 0.2f;
            normalPrice += dist * 0.1f;
            var ageDiscount = normalPrice * ageDiscountRate;
            var discountPrice = normalPrice - ageDiscount;
            var ticketDiscount = discountPrice * ticketTypeDiscountRate;
            if (ticketType == 2)
                totalPrice = (discountPrice - ticketDiscount) * 2;
            else
                totalPrice = discountPrice - ticketDiscount;
            System.out.printf("Total Price: %.2f TL", totalPrice);
        }

        input.close();
    }
}