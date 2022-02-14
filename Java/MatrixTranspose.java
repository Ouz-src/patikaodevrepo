package TestingPack;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 3, 4 },
                { 5, 6, 4 } };

        int[][] transposed = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        System.out.println("Original Matrix:");
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix:");
        for (int[] i : transposed) {
            for (int j : i) {
                if (j != 0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
