package Labsheet3;

// Q8.java
class Vehicle {
    int speed;

    void setSpeed(int s) {
        speed = s;
    }

    void setSpeed(int s, int bonus) {
        speed = s + bonus;
    }

    void display() {
        System.out.println("Speed: " + speed);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSpeed(100);
        v.display();

        v.setSpeed(100, 20);
        v.display();
    }
}

