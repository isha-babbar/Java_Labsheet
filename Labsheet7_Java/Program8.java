package labsheet7;
import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        ListIterator<Integer> it = list.listIterator(list.size());
        System.out.print("Reversed: ");
        while(it.hasPrevious()) System.out.print(it.previous() + " ");
    }
}
