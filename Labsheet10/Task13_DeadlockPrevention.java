package Labsheet10;

/*
13. Demonstrate deadlock prevention using proper locking order.
*/
public class Task13_DeadlockPrevention {
    static class Resource { final String name; Resource(String n){name=n;} }
    public static void main(String[] args) {
        final Resource r1 = new Resource("R1");
        final Resource r2 = new Resource("R2");

        Runnable rA = () -> {
            synchronized (r1) {
                System.out.println("A locked R1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (r2) {
                    System.out.println("A locked R2");
                }
            }
        };

        Runnable rB = () -> {
            // lock in same order to prevent deadlock
            synchronized (r1) {
                System.out.println("B locked R1");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                synchronized (r2) {
                    System.out.println("B locked R2");
                }
            }
        };

        new Thread(rA).start();
        new Thread(rB).start();
    }
}
