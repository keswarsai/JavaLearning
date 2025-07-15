package FactorialCalculation;

public class UsingDynamicProgramming{
    public static void main(String[] args) {
        int n = 5;
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }
        System.out.println("Factorial of " + n + " is " + fact[n]);
    }
}
