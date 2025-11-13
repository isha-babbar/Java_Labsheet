package Labsheet5;
// Task 7: final class cannot be extended
final class SealedClass {
    public void info() { System.out.println("I am a final class"); }
}

// public class AttemptExtend extends SealedClass { } // compile-time error: cannot inherit from final SealedClass

public class Task7_FinalClass {
    public static void main(String[] args) {
        SealedClass s = new SealedClass();
        s.info();
        System.out.println("Trying to extend a final class causes a compile-time error (see comments)."); 
    }
}
