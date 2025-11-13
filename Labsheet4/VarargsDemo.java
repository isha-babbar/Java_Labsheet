public class VarargsDemo {
    static void printStrings(String... strings) {
        for(String s : strings) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printStrings("Java", "Python", "C++");
    }
}