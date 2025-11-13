package Labsheet5;
// Task 20: Use interfaces to achieve multiple inheritance
interface Engine { void startEngine(); }
interface GPS { void navigate(); }

public class Task20_MultipleInheritanceInterface implements Engine, GPS {
    @Override public void startEngine() { System.out.println("Engine started"); }
    @Override public void navigate() { System.out.println("Navigating to destination"); }

    public static void main(String[] args) {
        Task20_MultipleInheritanceInterface car = new Task20_MultipleInheritanceInterface();
        car.startEngine();
        car.navigate();
    }
}
