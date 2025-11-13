package Labsheet8;
import java.util.*;

public class Q4_RemoveLessThanExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        set.removeIf(n -> n < 30);
        System.out.println("After removing < 30: " + set);
    }
}
