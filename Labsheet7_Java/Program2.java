package labsheet7;
import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Collection: " + names);
        names.remove("Bob");
        System.out.println("After removal: " + names);
        System.out.println("Contains Alice? " + names.contains("Alice"));
        System.out.println("Size: " + names.size());
    }
}
