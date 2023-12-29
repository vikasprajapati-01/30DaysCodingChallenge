import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = sc.nextInt();

        System.out.println("Enter the number of columns for the first matrix:");
        int cols1 = sc.nextInt();

        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = sc.nextInt();

        System.out.println("Enter the number of columns for the second matrix:");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix "
                    + "must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the elements of the first matrix:");
        readMatrix(matrix1, sc);

        System.out.println("Enter the elements of the second matrix:");
        readMatrix(matrix2, sc);

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Resultant matrix after multiplication is:");
        printMatrix(resultMatrix);
    }

    private static void readMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
