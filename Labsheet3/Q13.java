package Labsheet3;

// Q13.java
class Student {
    String name;
    int marks;
}

class StudentUpdater {
    Student updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
        return s;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Shahvez";
        st.marks = 70;

        StudentUpdater su = new StudentUpdater();
        st = su.updateMarks(st, 90);

        System.out.println("Updated Marks: " + st.marks);
    }
}
