package arraysandstrings;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 3, 4},
                {8, 3, 1},
                {5, 6, 7}
        };

        int[][] newMatrix = zeroMatrix(matrix);

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* Write and algorithm such that if an element in an MxN matrix
     * is 0, its entire row and column are set to 0.
     */
    private static int[][] zeroMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean rowHasZero = false;
        boolean colHasZero = false;

        // check if first row has a zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rowHasZero = true;
                break;
            }
        }

        // check if first column has a zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Nullify rows based on values in first column
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                nullifyRow(matrix, i);
            }
        }

        // Nullify cols based on values in first row
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                nullifyCol(matrix, j);
            }
        }

        // Nullify first row and column as necessary
        if (rowHasZero) {
            nullifyRow(matrix, 0);
        }
        if (colHasZero) {
            nullifyCol(matrix, 0);
        }

        return matrix;
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[row][j] = 0;
        }
    }

    private static void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
