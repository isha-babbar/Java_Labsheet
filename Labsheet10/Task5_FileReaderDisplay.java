package Labsheet10;

import java.io.FileReader;

/*
5. Read a text file using character streams (FileReader) and display its content.
*/
public class Task5_FileReaderDisplay {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java Labsheet10.Task5_FileReaderDisplay <filename>");
            return;
        }
        try (FileReader fr = new FileReader(args[0])) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char)c);
            }
        }
    }
}
