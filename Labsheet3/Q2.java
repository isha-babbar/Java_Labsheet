package Labsheet3;

class Rectangle{
    int width; 
    int height; 
    Rectangle(int width, int height) {
        this.width = width; 
        this.height = height; 
    }
    void calculateArea() {
        System.out.println("Area of Rectangle: " + width * height);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle area1 = new Rectangle(5, 10); 
        area1.calculateArea();
    }
}
