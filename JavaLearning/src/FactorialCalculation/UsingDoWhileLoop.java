package FactorialCalculation;

public class UsingDoWhileLoop {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= n);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}