package Labsheet2;

// Q8.8. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
import java.util.Scanner;

public class Q8 {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));
        sc.close();
    }
}
