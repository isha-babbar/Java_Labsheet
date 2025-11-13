package labsheet7;
import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        long start, end;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.add(i);
        end = System.nanoTime();
        System.out.println("ArrayList time: " + (end - start));
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList time: " + (end - start));
    }
}
