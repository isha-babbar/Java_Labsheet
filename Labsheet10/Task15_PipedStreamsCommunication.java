package Labsheet10;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
15. Use PipedInputStream and PipedOutputStream to implement communication between two threads.
*/
public class Task15_PipedStreamsCommunication {
    public static void main(String[] args) throws Exception {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        Thread producer = new Thread(() -> {
            try {
                for (int i=1;i<=5;i++) {
                    pos.write(("msg"+i+"\\n").getBytes());
                    Thread.sleep(100);
                }
                pos.close();
            } catch (Exception e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try {
                int b;
                while ((b = pis.read()) != -1) System.out.print((char)b);
            } catch (Exception e) { e.printStackTrace(); }
        });

        producer.start(); consumer.start();
    }
}
