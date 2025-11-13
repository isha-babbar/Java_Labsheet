package Labsheet8;
import java.util.*;

public class Q20_ClearCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        list.clear();
        System.out.println("Cleared List: " + list);
        System.out.println("Is Empty: " + list.isEmpty());
    }
}
