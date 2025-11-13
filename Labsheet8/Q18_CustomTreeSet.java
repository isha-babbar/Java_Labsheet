package Labsheet8;
import java.util.*;

class Person implements Comparable<Person> {
    String name; int age;
    Person(String n, int a) { name = n; age = a; }
    public int compareTo(Person p) { return this.age - p.age; }
    public String toString() { return name + " (" + age + ")"; }
}

public class Q18_CustomTreeSet {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("John", 25));
        set.add(new Person("Alex", 20));
        set.add(new Person("Mark", 30));

        for (Person p : set) System.out.println(p);
    }
}
