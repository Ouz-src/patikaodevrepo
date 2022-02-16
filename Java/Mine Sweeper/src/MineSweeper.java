import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rows;
    int columns;
    String[][] matrix;
    boolean endSession = false;
    int mineCount;
    int normalCells;

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new String[rows][columns];
    }

    void Play() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null)
                    matrix[i][j] = " - ";
            }
        }
        mineInsertion();
        normalCells = rows * columns - mineCount;
        System.out.println("====================================");
        while (!endSession) {
            checkIfWon();
            if (endSession)
                break;
            showMap(false);
            System.out.print("Please enter coordinate Row -> (0-" + (rows - 1) + "): ");
            int inRow = input.nextInt();
            System.out.print("Please enter coordinate Column -> (0-" + (columns - 1) + "): ");
            int inCol = input.nextInt();
            if (inRow >= rows || inCol >= columns) {
                System.out.println("Wrong coordinate! Try again.");
            } else {
                if (checkIsMined(inRow, inCol)) {
                    System.out.println("-------------------------------------");
                    System.out.println("MINE GOES BOOM! Game Over!");
                    System.out.println("Map: ");
                    showMap(true);
                    endSession = true;
                } else {
                    matrix[inRow][inCol] = " " + checkNeighbours(inRow, inCol) + " ";
                    normalCells--;
                }
            }
            System.out.println("-------------------------------------");
        }
        input.close();
    }

    void mineInsertion() {
        mineCount = rows * columns / 4;
        Random rand = new Random();
        int mineInserted = mineCount;
        while (mineInserted > 0) {
            int randMineRow = rand.nextInt(rows);
            int randMineCol = rand.nextInt(columns);
            if (!checkIsMined(randMineRow, randMineCol)) {
                matrix[randMineRow][randMineCol] = " * ";
                mineInserted--;
            }
        }
    }

    boolean checkIsMined(int row, int col) {
        if (matrix[row][col] == " * ")
            return true;

        return false;
    }

    void showMap(boolean showMines) {
        if (!showMines) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j].equals(" * "))
                        System.out.print(" - ");
                    else
                        System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == null)
                        matrix[i][j] = " - ";
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    void checkIfWon() {
        if (normalCells <= 0) {
            System.out.println("Congratulations! You Won.\nMap:");
            showMap(true);
            System.out.println("-------------------------------------");
            endSession = true;
        }
    }

    int checkNeighbours(int row, int col) {
        int mineCounter = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (row + x >= 0 && row + x < matrix.length && col + y >= 0 && col + y < matrix.length) {
                    if (matrix[x + row][y + col].equals(" * ")) {
                        mineCounter++;
                    }
                }
            }
        }
        return mineCounter;
    }
}
