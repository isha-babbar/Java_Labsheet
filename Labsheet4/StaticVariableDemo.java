public class StaticVariableDemo {
    private static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        increment();
        increment();
        System.out.println("Counter: " + getCounter());
    }
}