package Labsheet2;

// Q6.6. Write a Java Program convert Octal to Decimal Conversion.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal number: ");
        String octal = sc.next();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}
