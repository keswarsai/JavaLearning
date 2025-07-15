package FactorialCalculation;



public class UsingApacheMath {
    public static void main(String[] args) {
        int n = 5;
        long fact = ArithmeticUtils.factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }
}