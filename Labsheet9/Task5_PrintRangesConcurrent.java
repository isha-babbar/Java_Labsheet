package Labsheet9;

/*
  5. Create two threads that print numbers 1 to 5 and 6 to 10 respectively concurrently.
*/
public class Task5_PrintRangesConcurrent {
    static class RangePrinter implements Runnable {
        private final int start, end;
        RangePrinter(int s, int e) { start = s; end = e; }
        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RangePrinter(1,5), "Printer-1-5");
        Thread t2 = new Thread(new RangePrinter(6,10), "Printer-6-10");

        t1.start();
        t2.start();
    }
}
