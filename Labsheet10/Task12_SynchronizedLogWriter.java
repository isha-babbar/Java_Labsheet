package Labsheet10;

import java.io.FileWriter;
import java.io.PrintWriter;

/*
12. Implement a synchronized method to write to a shared log file by multiple threads.
*/
public class Task12_SynchronizedLogWriter {
    static class Logger {
        private final String logfile;
        public Logger(String logfile){ this.logfile = logfile; }
        public synchronized void log(String msg) {
            try (FileWriter fw = new FileWriter(logfile, true);
                 PrintWriter pw = new PrintWriter(fw)) {
                pw.println(msg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Logger logger = new Logger("shared.log");
        Runnable r = () -> {
            for (int i=0;i<5;i++) {
                logger.log(Thread.currentThread().getName() + " - message " + i);
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        };
        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Logging completed to shared.log");
    }
}
