package Labsheet8;
import java.util.*;

public class Q1_SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        System.out.println("Original Set: " + set);
        System.out.println("HeadSet (before Mango): " + set.headSet("Mango"));
        System.out.println("TailSet (from Mango): " + set.tailSet("Mango"));
        System.out.println("SubSet (Banana to Orange): " + set.subSet("Banana", "Orange"));
    }
}
