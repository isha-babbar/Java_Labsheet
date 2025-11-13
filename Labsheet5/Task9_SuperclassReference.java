package Labsheet5;
// Task 9: Superclass reference pointing to subclass object and calling overridden method
class Animal9 {
    public void eat() { System.out.println("Animal9 eats"); }
}

class Cat extends Animal9 {
    @Override
    public void eat() { System.out.println("Cat eats fish"); }
}

public class Task9_SuperclassReference {
    public static void main(String[] args) {
        Animal9 a = new Cat(); // superclass reference to subclass object
        a.eat(); // calls Cat.eat()
    }
}
