package Labsheet10;

import java.io.FileInputStream;

/*
3. Read a file byte by byte and display its contents on the console.
*/
public class Task3_ReadFileByteByByte {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java Labsheet10.Task3_ReadFileByteByByte <filename>");
            return;
        }
        try (FileInputStream fis = new FileInputStream(args[0])) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char)b);
            }
        }
    }
}
