package Labsheet8;
import java.util.*;

public class Q15_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4));
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Unique Elements: " + set);
    }
}
