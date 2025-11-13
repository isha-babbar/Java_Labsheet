package Labsheet5;
// Task 13: Use interface reference to call implemented methods
interface Speaker {
    void speak();
}

class Person13 implements Speaker {
    public void speak() { System.out.println("Person13 speaking..."); }
}

public class Task13_InterfaceReference {
    public static void main(String[] args) {
        Speaker s = new Person13(); // interface reference
        s.speak();
    }
}
