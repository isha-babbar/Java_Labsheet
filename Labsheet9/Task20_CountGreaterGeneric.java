package Labsheet9;

import java.util.List;

/*
  20. Write a generic method to count the number of elements greater than a given element in a list.
*/
public class Task20_CountGreaterGeneric {
    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T elem) {
        int count = 0;
        for (T t : list) if (t.compareTo(elem) > 0) count++;
        return count;
    }

    public static void main(String[] args) {
        java.util.List<Integer> a = java.util.Arrays.asList(1,5,3,7,2);
        System.out.println("Greater than 3: " + countGreaterThan(a, 3));
    }
}
