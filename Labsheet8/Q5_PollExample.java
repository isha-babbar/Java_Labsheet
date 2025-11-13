package Labsheet8;
import java.util.*;

public class Q5_PollExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5, 10, 15, 20, 25));
        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("Remaining Set: " + set);
    }
}
