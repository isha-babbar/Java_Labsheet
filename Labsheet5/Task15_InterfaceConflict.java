package Labsheet5;
// Task 15: Two interfaces A and B with same default method name, resolved in implementing class
interface A15 {
    default void hello() { System.out.println("Hello from A15"); }
}

interface B15 {
    default void hello() { System.out.println("Hello from B15"); }
}

public class Task15_InterfaceConflict implements A15, B15 {
    // must override to resolve conflict
    @Override
    public void hello() {
        // can call specific interface default implementations
        A15.super.hello();
        B15.super.hello();
        System.out.println("Resolved in implementing class"); 
    }

    public static void main(String[] args) {
        Task15_InterfaceConflict t = new Task15_InterfaceConflict();
        t.hello();
    }
}
