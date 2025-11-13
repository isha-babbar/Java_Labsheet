package labsheet7;
import java.util.*;
public class Program20 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("C","A","B"));
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("C","A","B"));
        System.out.println("HashSet order: " + hashSet);
        System.out.println("TreeSet order: " + treeSet);
    }
}
