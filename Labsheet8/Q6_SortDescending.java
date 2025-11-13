package Labsheet8;
import java.util.*;

public class Q6_SortDescending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 9);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted Descending: " + list);
    }
}
