import java.util.Scanner;
// 5. Write a program to accept a character and print its ASCII value.
class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println("ASCII value of " + ch + " is: " + (int) ch);
    }
}
