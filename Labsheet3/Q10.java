package Labsheet3;

// Q10.java
class Person {
    void displayFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Person p = new Person();
        p.displayFullName("Mohd", "Shahvez");
    }
}
