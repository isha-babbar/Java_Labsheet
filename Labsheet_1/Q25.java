import java.util.Scanner;
// 25. Accept two integers and a logical operator as a character. Use if-else to perform the logical
// operation and display the result.
class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter logical operator (&, |, ^): ");
        char op = sc.next().charAt(0);
        sc.close();
        if (op == '&')
            System.out.println("Result: " + (a & b));
        else if (op == '|')
            System.out.println("Result: " + (a | b));
        else if (op == '^')
            System.out.println("Result: " + (a ^ b));
        else
            System.out.println("Invalid Operator");
    }
}
