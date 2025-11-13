package labsheet6.exceptions;
public class CheckedVsUnchecked {
    static void checkedExample() throws Exception {
        throw new Exception("Checked Exception");
    }
    static void uncheckedExample() {
        throw new RuntimeException("Unchecked Exception");
    }
    public static void main(String[] args) {
        try {
            checkedExample();
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        uncheckedExample();
    }
}
