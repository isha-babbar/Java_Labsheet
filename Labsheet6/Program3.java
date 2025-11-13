package labsheet6.samepackage;
class A {
    int num = 10; // package-private
}
public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Accessing package-private variable: " + obj.num);
    }
}
