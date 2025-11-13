package labsheet6.pack2;
import labsheet6.vehicles.Car;
class ExtendedCar extends Car {
    void showProtected() {
        System.out.println("Accessing protected member: " + model);
    }
    public static void main(String[] args) {
        new ExtendedCar().showProtected();
    }
}
