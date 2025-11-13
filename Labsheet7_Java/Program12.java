package labsheet7;
import java.util.*;
public class Program12 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C"));
        ListIterator<String> it = list.listIterator();
        System.out.println("Forward:");
        while(it.hasNext()) System.out.println(it.next());
        System.out.println("Backward:");
        while(it.hasPrevious()) System.out.println(it.previous());
    }
}
