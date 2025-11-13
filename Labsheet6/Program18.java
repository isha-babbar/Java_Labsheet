package labsheet6.exceptions;
public class RethrowDemo {
    public static void main(String[] args) {
        try {
            try {
                int x = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Logging exception: " + e);
                throw e;
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught rethrown exception: " + e);
        }
    }
}
