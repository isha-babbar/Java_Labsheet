public class StaticNonStaticDemo {
    static void staticMethod() {
        System.out.println("Static method called");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called");
    }

    public static void main(String[] args) {
        staticMethod(); // static call
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod(); // non-static call
    }
}