package Labsheet9;

/*
  14. Create a generic method to print elements of an array of any type.
*/
public class Task14_PrintArrayGeneric {
    public static <T> void printArray(T[] arr) {
        for (T e : arr) System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"a","b","c"};
        Integer[] i = {1,2,3};
        printArray(s);
        printArray(i);
    }
}
