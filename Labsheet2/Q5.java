package Labsheet2;

// Q5.5. Write a Java Program convert Binary to Octal Conversion.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);

        System.out.println("Octal: " + octal);
        sc.close();
    }
}
