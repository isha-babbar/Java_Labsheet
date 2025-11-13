package Labsheet8;
import java.util.*;

public class Q2_NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Set: " + set);
        System.out.println("Lower(30): " + set.lower(30));
        System.out.println("Floor(30): " + set.floor(30));
        System.out.println("Ceiling(30): " + set.ceiling(30));
        System.out.println("Higher(30): " + set.higher(30));
    }
}
