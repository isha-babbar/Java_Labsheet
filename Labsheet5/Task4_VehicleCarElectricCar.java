package Labsheet5;
// Task 4: Multilevel inheritance Vehicle -> Car -> ElectricCar
class Vehicle {
    public void start() { System.out.println("Vehicle starting"); }
}

class Car extends Vehicle {
    public void drive() { System.out.println("Car driving"); }
}

public class Task4_VehicleCarElectricCar {
    static class ElectricCar extends Car {
        public void charge() { System.out.println("ElectricCar charging"); }
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.drive();
        tesla.charge();
    }
}
