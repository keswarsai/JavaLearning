package FibonacciSeries;

public class UsingMatrixExponentiation {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        int[][] matrix = {{1, 1}, {1, 0}};
        int[][] result = matrixPower(matrix, n - 1);
        return result[0][0];
    }
    
    public static int[][] matrixPower(int[][] matrix, int n) {
        if (n == 0) {
            return new int[][] {{1, 0}, {0, 1}};
        }
        if (n == 1) {
            return matrix;
        }
        int[][] halfPower = matrixPower(matrix, n / 2);
        int[][] result = matrixMultiply(halfPower, halfPower);
        if (n % 2 == 1) {
            result = matrixMultiply(result, matrix);
        }
        return result;
    }
    
    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int[][] result = new int[2][2];
        result[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        result[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        result[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        result[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return result;
    }
}