package Labsheet3; 
// Q7.java
class Vehicle {
    int speed;
    String color;

    Vehicle(int s, String c) {
        speed = s;
        color = c;
    }

    void display() {
        System.out.println("Speed: " + speed + " Color: " + color);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(120, "Red");
        Vehicle v2 = new Vehicle(80, "Blue");

        v1.display();
        v2.display();
    }
}
