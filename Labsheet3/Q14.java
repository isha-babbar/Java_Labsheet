package Labsheet3;

// Q14.java
class Calculator {
    int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum: " + c.sum(1, 2, 3, 4, 5));
    }
}
