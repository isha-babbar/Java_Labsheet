package Labsheet8;
import java.util.*;

public class Q8_MaxMin {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(10, 50, 30, 70, 20));
        System.out.println("Max: " + Collections.max(set));
        System.out.println("Min: " + Collections.min(set));
    }
}
