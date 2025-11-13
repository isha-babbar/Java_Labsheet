package Labsheet3;

// Q11.java
class Book {
    String title;
}

public class Q11 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";

        Book b2 = b1; // Reference assignment
        b2.title = "Advanced Java";

        System.out.println("Book1 Title: " + b1.title);
        System.out.println("Book2 Title: " + b2.title);
    }
}
