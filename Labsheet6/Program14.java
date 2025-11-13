package labsheet6.exceptions;
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Manually thrown exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
