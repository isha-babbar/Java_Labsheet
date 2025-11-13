package labsheet7;
import java.util.*;
public class Program15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            int val = it.next();
            it.set(val * 10);
        }
        System.out.println("Modified list: " + list);
    }
}
