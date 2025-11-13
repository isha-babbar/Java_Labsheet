package labsheet7;
import java.util.*;
public class Program1 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Collection of Integers: " + numbers);
    }
}
