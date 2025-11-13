package labsheet7;
import java.util.*;
public class Program11 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        Iterator<String> it = set.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
