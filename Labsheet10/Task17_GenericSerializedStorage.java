package Labsheet10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
17. Generic class that stores and retrieves serialized objects from files.
*/
public class Task17_GenericSerializedStorage<T extends Serializable> {
    private final String filename;
    public Task17_GenericSerializedStorage(String filename){ this.filename = filename; }

    public void save(List<T> items) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(items);
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> load() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<T>) ois.readObject();
        }
    }

    // simple demo main
    public static void main(String[] args) throws Exception {
        Task17_GenericSerializedStorage<String> storage = new Task17_GenericSerializedStorage<>("strings.ser");
        List<String> data = new ArrayList<>(); data.add("one"); data.add("two");
        storage.save(data);
        System.out.println("Saved. Loading back...");
        System.out.println(storage.load());
    }
}
