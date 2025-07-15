package FindingSmalletNumber;

import java.util.Arrays;

public class UsingJava8Stream {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 40};
        
        int smallest = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Smallest number is: " + smallest);
    }
}