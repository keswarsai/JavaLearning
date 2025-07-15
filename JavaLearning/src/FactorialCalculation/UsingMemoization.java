package FactorialCalculation;

import java.util.HashMap;

public class UsingMemoization{
    public static void main(String[] args) {
        int n = 5;
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 1);
        System.out.println("Factorial of " + n + " is " + factorial(n, memo));
    }
    
    public static int factorial(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = n * factorial(n - 1, memo);
        memo.put(n, result);
        return result;
    }
}
