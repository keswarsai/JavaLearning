package FindingLargestNumber;

import java.util.Arrays;

public class UsingJava8Stream {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        int largest = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest number is: " + largest);
    }
}