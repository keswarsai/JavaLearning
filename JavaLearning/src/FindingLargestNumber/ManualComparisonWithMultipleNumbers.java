package FindingLargestNumber;

public class ManualComparisonWithMultipleNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        System.out.println("Largest number is: " + largest);
    }
}