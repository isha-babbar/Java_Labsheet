package Labsheet9;

/*
  2. Create a thread by implementing the Runnable interface and run it.
*/
public class Task2_RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2: Runnable thread running - " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) System.out.println("Task2: count " + i);
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Task2_RunnableImpl());
        t.start();
    }
}
