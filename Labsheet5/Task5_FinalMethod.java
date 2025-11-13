package Labsheet5;
// Task 5: final method cannot be overridden
class AFinal {
    public final void cannotOverride() {
        System.out.println("Final method in AFinal");
    }
}

public class Task5_FinalMethod {
    static class BFinal extends AFinal {
        // Uncommenting following method will cause compiler error: cannot override final method
        // @Override
        // public void cannotOverride() { System.out.println("Trying to override"); }
    }

    public static void main(String[] args) {
        BFinal b = new BFinal();
        b.cannotOverride();
        System.out.println("Attempting to override a final method causes a compile-time error (comment demonstrates).");
    }
}
