package FibonacciSeries;

import java.util.HashMap;

public class UsingMemoization {
    public static void main(String[] args) {
        int n = 10;
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 0);
        memo.put(1, 1);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i, memo) + " ");
        }
    }
    
    public static int fibonacci(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}
