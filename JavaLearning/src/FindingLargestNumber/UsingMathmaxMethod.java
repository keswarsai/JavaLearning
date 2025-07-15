package FindingLargestNumber;

public class UsingMathmaxMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number is: " + largest);
    }
}