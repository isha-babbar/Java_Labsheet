package Labsheet5;
// Task 1: Base class Animal and derived Dog overriding makeSound(). Test polymorphism.
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Task1_AnimalDog {
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks: Woof Woof!");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog(); // polymorphism
        a.makeSound();
        d.makeSound();
    }
}
