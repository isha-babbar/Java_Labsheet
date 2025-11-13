package Labsheet8;
import java.util.*;

public class Q11_CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("A", "B", "C");
        List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        Collections.copy(dest, src);
        System.out.println("Copied List: " + dest);
    }
}
