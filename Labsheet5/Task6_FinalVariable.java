package Labsheet5;
// Task 6: final variable cannot be reassigned
public class Task6_FinalVariable {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println("Final x = " + x);
        // x = 20; // compile-time error: cannot assign a value to final variable x
        System.out.println("Uncommenting reassignment will cause a compilation error.");
    }
}
