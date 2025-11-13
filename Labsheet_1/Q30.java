// 30. Write a Java program to simulate a simple calculator that takes two numbers and an operator
// (+, -, *, /) and performs the corresponding operation using if-else.

import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
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
