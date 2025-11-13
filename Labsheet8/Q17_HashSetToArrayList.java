package Labsheet8;
import java.util.*;

public class Q17_HashSetToArrayList {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Red", "Blue", "Green"));
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("ArrayList: " + list);
    }
}
