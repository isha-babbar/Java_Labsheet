package labsheet7;
import java.util.*;
public class Program17 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("A","B","C"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("B","C","D"));
        set1.retainAll(set2);
        System.out.println("Common elements: " + set1);
    }
}
