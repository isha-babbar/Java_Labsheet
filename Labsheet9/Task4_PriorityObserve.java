package Labsheet9;

/*
  4. Set and get thread priority for multiple threads and observe their execution order.
*/
public class Task4_PriorityObserve {
    static class MyThread extends Thread {
        MyThread(String name, int pr) {
            super(name);
            setPriority(pr);
        }
        public void run() {
            System.out.println(getName() + " started with priority " + getPriority());
            for (int i=0;i<5;i++) System.out.println(getName() + " -> " + i);
            System.out.println(getName() + " finished");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread("HighPriority", Thread.MAX_PRIORITY);
        Thread t2 = new MyThread("NormalPriority", Thread.NORM_PRIORITY);
        Thread t3 = new MyThread("LowPriority", Thread.MIN_PRIORITY);

        t1.start(); t2.start(); t3.start();
    }
}
