package Labsheet9;

/*
  8. Write a program to demonstrate a deadlock situation with two threads.
*/
public class Task8_DeadlockDemo {
    static class Resource { private final String name; Resource(String n){name=n;} public String getName(){return name;} }

    public static void main(String[] args) {
        final Resource r1 = new Resource("R1");
        final Resource r2 = new Resource("R2");

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("T1 locked " + r1.getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (r2) {
                    System.out.println("T1 locked " + r2.getName());
                }
            }
        }, "T1");

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("T2 locked " + r2.getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (r1) {
                    System.out.println("T2 locked " + r1.getName());
                }
            }
        }, "T2");

        t1.start(); t2.start();
        /* This will likely deadlock: T1 holds r1 and waits for r2; T2 holds r2 and waits for r1 */
    }
}
