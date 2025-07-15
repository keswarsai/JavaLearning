package FindingSmalletNumber;

public class UsingRecursion  {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 40};
        int smallest = findSmallest(numbers, 0, numbers[0]);
        System.out.println("Smallest number is: " + smallest);
    }
    
    public static int findSmallest(int[] numbers, int index, int smallest) {
        if (index == numbers.length - 1) {
            return smallest;
        }
        if (numbers[index + 1] < smallest) {
            smallest = numbers[index + 1];
        }
        return findSmallest(numbers, index + 1, smallest);
    }
}