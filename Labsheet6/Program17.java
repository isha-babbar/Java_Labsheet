package labsheet6.exceptions;
public class ThrowsDemo {
    static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong!");
    }
    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Handled exception: " + e.getMessage());
        }
    }
}
