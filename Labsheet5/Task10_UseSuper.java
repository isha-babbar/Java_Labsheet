package Labsheet5;
// Task 10: Use super to access superclass method hidden by overriding
class Base10 {
    public void show() { System.out.println("Base10 show"); }
}

class Derived10 extends Base10 {
    @Override
    public void show() {
        System.out.println("Derived10 show"); 
    }
    public void parentShow() { super.show(); }
}

public class Task10_UseSuper {
    public static void main(String[] args) {
        Derived10 d = new Derived10();
        d.show();
        d.parentShow(); // calls Base10.show() via super
    }
}
