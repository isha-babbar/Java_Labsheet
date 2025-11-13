package Labsheet10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1. Read a line of text from the console using InputStreamReader and BufferedReader.
*/
public class Task1_InputStreamReaderBufferedReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line: ");
        String line = br.readLine();
        System.out.println("You entered: " + line);
    }
}
