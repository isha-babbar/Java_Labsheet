package Labsheet3;

/* 3. Write a Student class with private attributes and public getter/setter methods.
Demonstrate encapsulation.
4. Create a class Circle with a constructor to initialize radius and a method to calculate
area.
5. Create a class Employee and write a method to display employee details.
 */

class Student {
    // private attributes (Encapsulation)
    private String name;
    private int age;
    private String course;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}

class Circle {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Q3_4_5{
public class Main {
    public static void main(String[] args) {
        // 1. Encapsulation – Student
        Student st = new Student();
        st.setName("Shahvez");
        st.setAge(22);
        st.setCourse("MCA");

        System.out.println("Student Details:");
        System.out.println("Name: " + st.getName());
        System.out.println("Age: " + st.getAge());
        System.out.println("Course: " + st.getCourse());
        System.out.println("----------------------");

        // 2. Circle
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("----------------------");

        // 3. Employee
        Employee emp = new Employee("Fardeen", 101, 55000);
        emp.displayEmployeeDetails();
    }
}
}
