package Labsheet5;
// Task 8: Class hierarchy demonstrating method overriding and polymorphic calls
class SuperA {
    public void show() { System.out.println("SuperA show"); }
}

class SubA extends SuperA {
    @Override
    public void show() { System.out.println("SubA show"); }
}

public class Task8_MethodOverridingPolymorphism {
    public static void main(String[] args) {
        SuperA obj1 = new SuperA();
        SuperA obj2 = new SubA();
        obj1.show();
        obj2.show(); // polymorphic: runs SubA.show()
    }
}
