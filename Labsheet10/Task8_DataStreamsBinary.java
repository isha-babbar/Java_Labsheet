package Labsheet10;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

/*
8. Read and write binary data (e.g., images) using DataInputStream and DataOutputStream.
   Here we write some primitives to a file and read them back.
*/
public class Task8_DataStreamsBinary {
    public static void main(String[] args) throws Exception {
        String file = "task8.bin";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(2025);
            dos.writeDouble(3.14159);
            dos.writeUTF("Task8");
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            System.out.println("Int: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("UTF: " + dis.readUTF());
        }
    }
}
