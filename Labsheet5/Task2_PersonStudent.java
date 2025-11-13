package Labsheet5;
// Task 2: Person and Student with constructors using super
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println("Person: " + name + ", age " + age);
    }
}

public class Task2_PersonStudent {
    static class Student extends Person {
        String college;
        Student(String name, int age, String college) {
            super(name, age);
            this.college = college;
        }
        @Override
        public void show() {
            System.out.println("Student: " + name + ", age " + age + ", college " + college);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Aisha", 20, "COER University");
        s.show();
    }
}
