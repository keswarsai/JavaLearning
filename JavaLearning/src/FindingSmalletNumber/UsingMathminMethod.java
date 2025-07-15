package FindingSmalletNumber;

public class UsingMathminMethod{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        
        int smallest = Math.min(a, Math.min(b, c));
        System.out.println("Smallest number is: " + smallest);
    }
}