package FibonacciSeries;

public class UsingIteration{
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
