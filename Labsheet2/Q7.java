package Labsheet2;

// Q7.7. Write a Java recursive method to calculate the factorial of a given positive integer.
import java.util.Scanner;

public class Q7 {
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial: " + factorial(n));
        sc.close();
    }
}
