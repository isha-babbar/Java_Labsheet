package Labsheet8;
import java.util.*;

public class Q3_DescendingIteratorExample {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(Arrays.asList("A", "B", "C", "D"));
        Iterator<String> itr = tree.descendingIterator();

        System.out.println("Descending Order:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
