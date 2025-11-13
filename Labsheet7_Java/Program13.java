package labsheet7;
import java.util.*;
public class Program13 {
    public static void main(String[] args) {
        ListIterator<String> it = new LinkedList<String>(Arrays.asList("One","Two")).listIterator();
        while(it.hasNext()) {
            String val = it.next();
            if(val.equals("One")) it.add("Inserted");
        }
        System.out.println("Updated list: " + Arrays.asList("One","Inserted","Two"));
    }
}
