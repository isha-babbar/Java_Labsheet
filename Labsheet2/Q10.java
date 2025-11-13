package Labsheet2;

// Q10.10. Write a Java recursive method to check if a given string is a palindrome.
import java.util.Scanner;

public class Q10 {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();
        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");
    }
}
