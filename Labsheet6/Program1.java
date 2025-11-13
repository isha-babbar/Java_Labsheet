package labsheet6.vehicles;
public class Car {
    public String brand = "Toyota";
    private int speed = 120;
    protected String model = "Corolla";
    String color = "Red"; // default access
    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Color: " + color + ", Speed: " + speed);
    }
}
