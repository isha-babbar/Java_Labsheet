public class Outer {
    static class Inner {
        void display() {
            System.out.println("Static Nested Class Method");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.display();
    }
}