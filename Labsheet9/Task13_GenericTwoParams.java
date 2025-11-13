package Labsheet9;

/*
  13. Implement a generic class with two type parameters and demonstrate its use with different types.
*/
public class Task13_GenericTwoParams<K, V> {
    private K key; private V value;
    public Task13_GenericTwoParams(K k, V v){ key = k; value = v; }
    public K getKey(){ return key; }
    public V getValue(){ return value; }

    public static void main(String[] args) {
        Task13_GenericTwoParams<String, Integer> p1 = new Task13_GenericTwoParams<>("age", 21);
        Task13_GenericTwoParams<Integer, String> p2 = new Task13_GenericTwoParams<>(1, "one");
        System.out.println(p1.getKey() + " -> " + p1.getValue());
        System.out.println(p2.getKey() + " -> " + p2.getValue());
    }
}
