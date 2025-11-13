package Labsheet9;

import java.util.List;

/*
  19. Demonstrate the use of wildcards (?, ? extends, ? super) in method parameters.
*/
public class Task19_WildcardsDemo {
    static void printAny(List<?> list) {
        for (Object o : list) System.out.print(o + " ");
        System.out.println();
    }

    static double sumExtends(List<? extends Number> nums) {
        double s = 0;
        for (Number n : nums) s += n.doubleValue();
        return s;
    }

    static void addSuper(List<? super Integer> list) {
        list.add(10); // allowed
    }

    public static void main(String[] args) {
        List<Integer> ints = java.util.Arrays.asList(1,2,3);
        List<Double> dbls = java.util.Arrays.asList(1.5,2.5);
        printAny(ints); printAny(dbls);
        System.out.println("sum: " + sumExtends(ints));
        // addSuper requires a mutable list; demonstrate on an ArrayList
        java.util.List<Number> numbers = new java.util.ArrayList<>();
        addSuper(numbers);
        printAny(numbers);
    }
}
