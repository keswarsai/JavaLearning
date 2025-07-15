package FindingSmalletNumber;

public class UsingIfelseStatement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        
        if (a <= b && a <= c) {
            System.out.println("Smallest number is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Smallest number is: " + b);
        } else {
            System.out.println("Smallest number is: " + c);
        }
    }
}
