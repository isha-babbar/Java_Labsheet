package Labsheet5;
// Task 18: Demonstrate private methods inside interfaces (Java 9+)
interface Helper18 {
    private static String prefix() { return "[Helper] -> "; } // private static
    private String suffix() { return " <- end"; } // private instance method

    default void showBoth() {
        System.out.println(prefix() + "showBoth" + suffix());
    }
}

public class Task18_InterfacePrivateMethods implements Helper18 {
    public static void main(String[] args) {
        Task18_InterfacePrivateMethods t = new Task18_InterfacePrivateMethods();
        t.showBoth();
    }
}
