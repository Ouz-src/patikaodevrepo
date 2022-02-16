import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = input.nextInt();
        System.out.print("Enter number of columns: ");
        int c = input.nextInt();
        while (r < 2 || c < 2) {
            System.out.println(
                    "Please enter bigger numbers than 2 (Board cannot be created if rows or columns are smaller than 2.)");
            System.out.print("Enter number of rows: ");
            r = input.nextInt();
            System.out.print("Enter number of columns: ");
            c = input.nextInt();
        }
        MineSweeper mineSweeper = new MineSweeper(r, c);
        mineSweeper.Play();
        input.close();
    }
}
