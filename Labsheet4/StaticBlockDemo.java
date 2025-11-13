public class StaticBlockDemo {
    static int value;

    static {
        value = 100;
        System.out.println("Static block executed. Value = " + value);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}