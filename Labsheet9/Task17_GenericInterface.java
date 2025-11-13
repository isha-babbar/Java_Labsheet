package Labsheet9;

/*
  17. Write a program to create a generic interface and implement it in a class.
*/
interface Task17_Storage<T> {
    void put(T item);
    T get();
}

class Task17_StorageImpl<T> implements Task17_Storage<T> {
    private T item;
    public void put(T item){ this.item = item; }
    public T get(){ return item; }
}

public class Task17_GenericInterface {
    public static void main(String[] args) {
        Task17_Storage<String> s = new Task17_StorageImpl<>();
        s.put("stored");
        System.out.println("Got: " + s.get());
    }
}
