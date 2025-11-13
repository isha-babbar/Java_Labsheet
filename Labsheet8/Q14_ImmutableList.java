package Labsheet8;
import java.util.*;

public class Q14_ImmutableList {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("A", "B", "C"));
        System.out.println("Immutable List: " + list);
    }
}
