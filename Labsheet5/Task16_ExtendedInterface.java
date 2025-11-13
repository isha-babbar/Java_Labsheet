package Labsheet5;
// Task 16: Interface extending another interface
interface Base16 {
    void baseMethod();
}

interface Derived16 extends Base16 {
    void derivedMethod();
}

public class Task16_ExtendedInterface implements Derived16 {
    @Override public void baseMethod() { System.out.println("baseMethod implementation"); }
    @Override public void derivedMethod() { System.out.println("derivedMethod implementation"); }

    public static void main(String[] args) {
        Derived16 d = new Task16_ExtendedInterface();
        d.baseMethod();
        d.derivedMethod();
    }
}
