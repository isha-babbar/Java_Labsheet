import java.util.Scanner;
// 19. Accept a character and use if-else to identify whether it&#39;s a valid operator (+, -, *, /) and perform
// the corresponding operation on two input numbers.
class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        sc.close();
        if (op == '+')
            System.out.println("Result: " + (a + b));
        else if (op == '-')
            System.out.println("Result: " + (a - b));
        else if (op == '*')
            System.out.println("Result: " + (a * b));
        else if (op == '/')
            System.out.println("Result: " + (a / b));
        else
            System.out.println("Invalid Operator!");
    }
}
