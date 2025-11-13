package Labsheet8;
import java.util.*;

public class Q10_SynchronizedList {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("One");
        list.add("Two");

        synchronized (list) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
