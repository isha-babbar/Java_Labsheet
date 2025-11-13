package Labsheet10;

/*
20. Demonstrate thread interruption and handle InterruptedException.
*/
public class Task20_ThreadInterruptionDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper: going to sleep for 5 seconds");
                Thread.sleep(5000);
                System.out.println("Sleeper: woke normally");
            } catch (InterruptedException e) {
                System.out.println("Sleeper: interrupted while sleeping");
            }
        });
        sleeper.start();
        Thread.sleep(1000);
        sleeper.interrupt();
        sleeper.join();
        System.out.println("Main: finished");
    }
}
