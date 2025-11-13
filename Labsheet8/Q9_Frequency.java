package Labsheet8;
import java.util.*;

public class Q9_Frequency {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "A"));
        System.out.println("Frequency of 'A': " + Collections.frequency(list, "A"));
    }
}
