package Labsheet2;
// Q9.9. Write a Java recursive method to calculate the nth Fibonacci number.
import java.util.Scanner;

public class Q9 {
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(n + "th Fibonacci number: " + fibonacci(n));
    }
}
