package Labsheet9;

/*
  12. Write a generic method that swaps two elements in an array.
*/
public class Task12_ArraySwapGeneric {
    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        swap(a, 0, 2);
        for (int v : a) System.out.print(v + " ");
    }
}
