package FibonacciSeries;

public class UsingClosedForm {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        return (int) ((Math.pow(phi, n) - Math.pow(1 - phi, n)) / sqrt5);
    }
}