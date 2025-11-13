package Labsheet8;
import java.util.*;

class Student {
    String name; int age;
    Student(String n, int a) { name = n; age = a; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Q16_CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("John", 20));
        list.add(new Student("Emma", 22));

        ListIterator<Student> it = list.listIterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
