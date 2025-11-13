package Labsheet3; 
// Q9.java
class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
    int multiply(int a, int b) { return a * b; }
    double divide(int a, int b) { return (double)a / b; }
}

public class Q9 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Subtract: " + c.subtract(10, 5));
        System.out.println("Multiply: " + c.multiply(10, 5));
        System.out.println("Divide: " + c.divide(10, 5));
    }
}
