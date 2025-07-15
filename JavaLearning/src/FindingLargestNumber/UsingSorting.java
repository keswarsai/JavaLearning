package FindingLargestNumber;

import java.util.Arrays;

public class UsingSorting {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];
        System.out.println("Largest number is: " + largest);
    }
}