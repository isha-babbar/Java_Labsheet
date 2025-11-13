package Labsheet9;

/*
  10. Write a program to demonstrate thread-safe increment of a shared counter using synchronization.
*/
public class Task10_SynchronizedCounter {
    static class Counter {
        private int count = 0;
        public synchronized void increment() { count++; }
        public int getCount() { return count; }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable r = () -> {
            for (int i=0;i<1000;i++) c.increment();
        };

        Thread t1 = new Thread(r), t2 = new Thread(r), t3 = new Thread(r);
        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();
        System.out.println("Final count (should be 3000): " + c.getCount());
    }
}
