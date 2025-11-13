package Labsheet9;

/*
  18. Create a generic class that restricts its type parameter to classes implementing Comparable.
*/
public class Task18_ComparableGeneric<T extends Comparable<T>> {
    private T value;
    public Task18_ComparableGeneric(T v){ value = v; }
    public boolean isGreaterThan(T other){ return value.compareTo(other) > 0; }

    public static void main(String[] args) {
        Task18_ComparableGeneric<Integer> g = new Task18_ComparableGeneric<>(10);
        System.out.println("10 > 5 ? " + g.isGreaterThan(5));
    }
}
