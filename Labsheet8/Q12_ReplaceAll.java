package Labsheet8;
import java.util.*;

public class Q12_ReplaceAll {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "C", "Java", "Python"));
        Collections.replaceAll(list, "Java", "Kotlin");
        System.out.println("After Replace: " + list);
    }
}
