package Labsheet5;
// Task 12: Interface Movable with moveUp and moveDown implemented by Robot
interface Movable {
    void moveUp();
    void moveDown();
}

public class Task12_MovableRobot implements Movable {
    @Override
    public void moveUp() { System.out.println("Robot moves up"); }
    @Override
    public void moveDown() { System.out.println("Robot moves down"); }

    public static void main(String[] args) {
        Task12_MovableRobot r = new Task12_MovableRobot();
        r.moveUp();
        r.moveDown();
    }
}
