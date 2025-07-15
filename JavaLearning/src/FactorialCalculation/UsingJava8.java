package FactorialCalculation;

import java.util.stream.LongStream;

public class UsingJava8 {
    public static void main(String[] args) {
        int n = 5;
        long fact = LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}

