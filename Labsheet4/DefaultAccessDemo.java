package mypackage;

class DefaultClass {
    String message = "Default Access";
}

public class DefaultAccessDemo {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println(obj.message);
    }
}