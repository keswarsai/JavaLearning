package FindingLargestNumber;

public class UsingRecursion {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int largest = findLargest(numbers, 0, numbers[0]);
        System.out.println("Largest number is: " + largest);
    }
    
    public static int findLargest(int[] numbers, int index, int largest) {
        if (index == numbers.length - 1) {
            return largest;
        }
        if (numbers[index + 1] > largest) {
            largest = numbers[index + 1];
        }
        return findLargest(numbers, index + 1, largest);
    }
}