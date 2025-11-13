package Labsheet2;

// Q2.2. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Binary → Decimal
        System.out.print("Enter a Binary number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);

        // Decimal → Binary
        System.out.print("Enter a Decimal number: ");
        int dec = sc.nextInt();
        String bin = Integer.toBinaryString(dec);
        System.out.println("Binary: " + bin);
        sc.close();
    }
}
