package Labsheet10;

import java.io.BufferedReader;
import java.io.FileReader;

/*
11. Create multiple threads to read different files concurrently and print their contents.
*/
public class Task11_MultiThreadReadFiles {
    static class FileReaderRunnable implements Runnable {
        private final String filename;
        FileReaderRunnable(String f){ filename = f; }
        public void run() {
            System.out.println("Reading: " + filename + " by " + Thread.currentThread().getName());
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("[" + filename + "] " + line);
                }
            } catch (Exception e) {
                System.err.println("Error reading " + filename + ": " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Labsheet10.Task11_MultiThreadReadFiles <file1> <file2> ...");
            return;
        }
        for (String f : args) new Thread(new FileReaderRunnable(f)).start();
    }
}
