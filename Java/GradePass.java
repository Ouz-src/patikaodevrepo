package TestingPack;

import java.util.Scanner;

public class GradePass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chem, music;
        System.out.println("Your Math mark: ");
        math = input.nextInt();
        System.out.println("Your Physics mark: ");
        physics = input.nextInt();
        System.out.println("Your Turkish mark: ");
        turkish = input.nextInt();
        System.out.println("Your Chemistry mark: ");
        chem = input.nextInt();
        System.out.println("Your Music mark: ");
        music = input.nextInt();

        double average = (math + physics + turkish + chem + music)/5;
        System.out.printf("Average: %.2f\n", average);
        if(average >= 55)
            System.out.println("Congratulations! You passed grade!");
        else
            System.out.println("You failed to pass grade!");
        input.close();
    }
}