package Labsheet9;

/*
  15. Write a generic class to implement a simple pair of two related objects.
*/
public class Task15_PairGeneric<A,B> {
    private final A first;
    private final B second;
    public Task15_PairGeneric(A a, B b){ first = a; second = b; }
    public A getFirst(){ return first; }
    public B getSecond(){ return second; }

    public static void main(String[] args) {
        Task15_PairGeneric<String, Integer> p = new Task15_PairGeneric<>("roll", 101);
        System.out.println(p.getFirst() + " - " + p.getSecond());
    }
}
