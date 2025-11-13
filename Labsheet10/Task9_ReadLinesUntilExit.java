package Labsheet10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
9. Read multiple lines from the console until the user types "exit" using buffered character streams.
*/
public class Task9_ReadLinesUntilExit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("Type lines (type 'exit' to quit):");
        while ((line = br.readLine()) != null) {
            if ("exit".equalsIgnoreCase(line.trim())) break;
            System.out.println("Echo: " + line);
        }
        System.out.println("Exited.");
    }
}
