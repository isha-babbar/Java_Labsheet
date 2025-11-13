package Labsheet3;

// Q15.java
class Car {
    String model;
    int speed;

    Car setModel(String model) {
        this.model = model;
        return this;
    }

    Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    void display() {
        System.out.println("Model: " + model + " Speed: " + speed);
    }
}

public class Q15 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("BMW").setSpeed(200).display();
    }
}
