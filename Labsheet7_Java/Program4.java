package labsheet7;
import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        list.add(1, "X");
        System.out.println("After inserting at index 1: " + list);
    }
}
