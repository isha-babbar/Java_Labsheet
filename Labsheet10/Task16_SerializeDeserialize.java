package Labsheet10;

import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

/*
16. Serialize an object to a file and deserialize it back using object streams.
*/
public class Task16_SerializeDeserialize {
    static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        String name; int age;
        Person(String n,int a){name=n; age=a;}
        public String toString(){ return name + " (" + age + ")"; }
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person("Alice", 25);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(p);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person p2 = (Person) ois.readObject();
            System.out.println("Deserialized: " + p2);
        }
    }
}
