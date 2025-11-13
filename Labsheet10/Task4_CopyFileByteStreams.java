package Labsheet10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
4. Copy a file's contents using byte streams (FileInputStream and FileOutputStream).
*/
public class Task4_CopyFileByteStreams {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java Labsheet10.Task4_CopyFileByteStreams <source> <dest>");
            return;
        }
        try (FileInputStream fis = new FileInputStream(args[0]);
             FileOutputStream fos = new FileOutputStream(args[1])) {
            byte[] buf = new byte[4096];
            int n;
            while ((n = fis.read(buf)) != -1) {
                fos.write(buf, 0, n);
            }
        }
        System.out.println("Copy completed.");
    }
}
