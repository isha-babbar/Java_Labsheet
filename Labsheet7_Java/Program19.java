package labsheet7;
import java.util.*;
public class Program19 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10,20,30,40));
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
    }
}
