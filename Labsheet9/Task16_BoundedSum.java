package Labsheet9;

/*
  16. Demonstrate the use of bounded type parameters by creating a generic method that accepts numbers and calculates their sum.
*/
public class Task16_BoundedSum {
    public static <T extends Number> double sum(T[] arr) {
        double s = 0;
        for (T n : arr) s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        Double[] b = {1.5, 2.5};
        System.out.println("Sum ints: " + sum(a));
        System.out.println("Sum doubles: " + sum(b));
    }
}
