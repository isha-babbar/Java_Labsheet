package Labsheet10;

import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/*
2. Write a string to the console using OutputStreamWriter.
*/
public class Task2_OutputStreamWriterConsole {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Task2: Writing this string using OutputStreamWriter\\n");
        bw.flush();
    }
}
