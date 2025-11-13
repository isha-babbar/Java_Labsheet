package labsheet6.exceptions;
import java.io.*;
public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("IO Exception caught first.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }
}
