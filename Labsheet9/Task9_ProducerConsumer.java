package Labsheet9;

import java.util.LinkedList;
import java.util.Queue;

/*
  9. Implement thread communication using wait() and notify() methods between producer and consumer threads.
*/
public class Task9_ProducerConsumer {
    static class Drop {
        private final Queue<Integer> q = new LinkedList<>();
        private final int capacity = 5;

        public synchronized void put(int value) throws InterruptedException {
            while (q.size() == capacity) wait();
            q.add(value);
            System.out.println("Produced: " + value);
            notifyAll();
        }

        public synchronized int take() throws InterruptedException {
            while (q.isEmpty()) wait();
            int v = q.remove();
            System.out.println("Consumed: " + v);
            notifyAll();
            return v;
        }
    }

    public static void main(String[] args) {
        Drop drop = new Drop();

        Thread producer = new Thread(() -> {
            try {
                for (int i=1;i<=10;i++){ drop.put(i); Thread.sleep(100); }
            } catch (InterruptedException e) {}
        }, "Producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i=1;i<=10;i++){ drop.take(); Thread.sleep(150); }
            } catch (InterruptedException e) {}
        }, "Consumer");

        producer.start(); consumer.start();
    }
}
