package Labsheet10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*
10. Read user input and write it into a file until a termination string is entered.
*/
public class Task10_WriteUntilTermination {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java Labsheet10.Task10_WriteUntilTermination <outfile>");
            return;
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(args[0])) {
            String line;
            System.out.println("Type lines (type 'STOP' to end):");
            while ((line = br.readLine()) != null) {
                if ("STOP".equals(line)) break;
                fw.write(line);
                fw.write(System.lineSeparator());
            }
        }
        System.out.println("Finished writing to file.");
    }
}
