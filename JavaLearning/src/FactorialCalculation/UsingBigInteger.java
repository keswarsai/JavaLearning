package FactorialCalculation;

import java.math.BigInteger;

public class UsingBigInteger {
    public static void main(String[] args) {
        int n = 50;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
