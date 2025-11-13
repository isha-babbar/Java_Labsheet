public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(multiply(4, 2));
        System.out.println(subtract(10, 7));
    }
}