package Labsheet10;

import java.io.FileWriter;

/*
6. Write text data to a file using FileWriter.
*/
public class Task6_FileWriterWrite {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java Labsheet10.Task6_FileWriterWrite <filename>");
            return;
        }
        try (FileWriter fw = new FileWriter(args[0])) {
            fw.write("This is sample text written by Task6_FileWriterWrite.\\nLine 2.");
        }
        System.out.println("Write completed.");
    }
}
