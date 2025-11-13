package labsheet7;
import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if(it.next() == 3) it.remove();
        }
        System.out.println("After removal: " + list);
    }
}
