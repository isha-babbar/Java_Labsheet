package Labsheet5;
// Task 17: Interface with constants (implicitly public static final)
interface Consts {
    int VALUE = 100; // implicitly public static final
    String NAME = "LABSHEET";
}

public class Task17_InterfaceConstants implements Consts {
    public static void main(String[] args) {
        System.out.println("VALUE = " + VALUE);
        System.out.println("NAME = " + NAME);
    }
}
