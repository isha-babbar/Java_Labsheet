package Labsheet9;

/*
  11. Create a generic class Box that stores an object of any type and implements methods to set and get the object.
*/
public class Task11_BoxGeneric<T> {
    private T obj;
    public void set(T o){ obj = o; }
    public T get(){ return obj; }

    public static void main(String[] args) {
        Task11_BoxGeneric<String> b = new Task11_BoxGeneric<>();
        b.set("Hello");
        System.out.println("Box contains: " + b.get());
    }
}
