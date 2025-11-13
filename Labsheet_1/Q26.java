import java.util.Scanner;
// 26. Write a Java program to input a five-digit number and check whether the first and last digits are
// the same using arithmetic expressions and type casting.
class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 10000;
        sc.close();
        if (first == last)
            System.out.println("First and Last digits are SAME");
        else
            System.out.println("First and Last digits are DIFFERENT");
    }
}
