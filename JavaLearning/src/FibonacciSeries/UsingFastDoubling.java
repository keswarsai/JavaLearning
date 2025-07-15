package FibonacciSeries;

public class UsingFastDoubling {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        return fib(n)[0];
    }
    
    public static int[] fib(int n) {
        if (n == 0) {
            return new int[] {0, 1};
        }
        int[] f = fib(n / 2);
        int c = f[0] * (2 * f[1] - f[0]);
        int d = f[0] * f[0] + f[1] * f[1];
        if (n % 2 == 0) {
            return new int[] {c, d};
        } else {
            return new int[] {d, c + d};
        }
    }
}