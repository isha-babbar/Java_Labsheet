package Labsheet10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/*
7. Demonstrate try-with-resources while reading from and writing to files.
*/
public class Task7_TryWithResources {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java Labsheet10.Task7_TryWithResources <infile> <outfile>");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
             FileWriter fw = new FileWriter(args[1])) {
            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line);
                fw.write(System.lineSeparator());
            }
        }
        System.out.println("Copy with try-with-resources completed.");
    }
}
