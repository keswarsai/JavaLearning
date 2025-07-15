package FactorialCalculation;

public class UsingRecursion{
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

