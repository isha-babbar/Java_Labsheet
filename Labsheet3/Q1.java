package Labsheet3;
// Define a class Book with attributes: title, author, and price. Create an object and display
// its details.

import java.util.ArrayList;
import java.util.*; 

class Book{
    String tittle; 
    String author; 
    Float price; 
    static List<Book> allBook = new ArrayList<>(); 

    Book(String tittle, String author, Float price) {
        this.tittle = tittle; 
        this.author = author; 
        this.price = price; 
    }

     void insertDataInList(Book receiveBook) {
            allBook.add(receiveBook); 
    }

    static void displayBook() {
        for(Book book: allBook) {
            System.out.println("Book Detail: " + book);
        }
    }

    @Override
    public String toString() {
        return "Title: " + tittle + ", Author: " + author + ", Price: " + price;
    }

    // void insertDataInList(List<Book> receiveBook) {
    //     for(Book book: receiveBook) {
    //         allBook.add(book); 
    //     }
    // }
    
}

public class Q1 {
    public static void main(String[] args) {
        Book book1 = new Book("Head of Java", "MOHD SHAHVEZ", 550f); 
        book1.insertDataInList(book1);
        Book book2 = new Book("Computer Network", "Fardeen Gaur", 400f); 
        book2.insertDataInList(book2);
        Book book3 = new Book("DSA", "Sahil Chauhan", 650f); 
        book3.insertDataInList(book3);

        Book.displayBook();

    }
}


// import java.util.ArrayList;

// // Book class
// class Book {
//     private String title;
//     private String author;
//     private int price;

//     // Constructor
//     public Book(String title, String author, int price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     // Getters
//     public String getTitle() {
//         return title;
//     }
//     public String getAuthor() {
//         return author;
//     }
//     public int getPrice() {
//         return price;
//     }

//     // Optional: toString() override for clean printing
//     @Override
//     public String toString() {
//         return "Book{title='" + title + "', author='" + author + "', price=" + price + "}";
//     }
// }

// public class Example {
//     public static void main(String[] args) {
//         ArrayList<Book> books = new ArrayList<>();

//         // Adding objects
//         books.add(new Book("Java Basics", "Shahvez", 500));
//         books.add(new Book("Spring Boot", "Fardeen", 700));
//         books.add(new Book("React Guide", "Isha", 600));

//         // Access object values with getters
//         for(Book b : books) {
//             System.out.println("Title: " + b.getTitle());
//             System.out.println("Author: " + b.getAuthor());
//             System.out.println("Price: " + b.getPrice());
//             System.out.println("-----------------");
//         }

//         // OR if toString() is overridden
//         System.out.println(books);
//     }
// }

