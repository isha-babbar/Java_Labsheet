package Labsheet8;
import java.util.*;

public class Q7_ShuffleList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
