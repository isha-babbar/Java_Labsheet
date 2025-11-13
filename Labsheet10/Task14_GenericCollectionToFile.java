package Labsheet10;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

/*
14. Use generics to implement a type-safe collection and write its contents to a file.
*/
public class Task14_GenericCollectionToFile {
    public static <T> void writeListToFile(List<T> list, String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (T t : list) pw.println(t);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        writeListToFile(students, "students.txt");
        System.out.println("Wrote students.txt");
    }
}
