package Labsheet5;
// Task 19: Class implements multiple interfaces and demonstrates methods
interface A19 { void a(); }
interface B19 { void b(); }

public class Task19_MultipleInterfaces implements A19, B19 {
    @Override public void a() { System.out.println("Method a()"); }
    @Override public void b() { System.out.println("Method b()"); }

    public static void main(String[] args) {
        Task19_MultipleInterfaces obj = new Task19_MultipleInterfaces();
        obj.a();
        obj.b();
    }
}
