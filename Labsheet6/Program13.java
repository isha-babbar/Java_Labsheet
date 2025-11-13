package labsheet6.exceptions;
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
