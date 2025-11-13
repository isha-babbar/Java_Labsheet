package Labsheet5;
// Task 11: Abstract class Shape with subclasses Circle and Rectangle
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape {
    @Override
    void draw() { System.out.println("Drawing Rectangle"); }
}

public class Task11_AbstractShape {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.draw();
        r.draw();
    }
}
