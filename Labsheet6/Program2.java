package labsheet6.test;
import labsheet6.vehicles.Car;
public class AccessTest {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Accessing public member: " + c.brand);
        c.display();
    }
}
