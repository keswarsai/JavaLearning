package FindingSmalletNumber;

public class UsingTernaryOperator  {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        
        int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("Smallest number is: " + smallest);
    }

 }