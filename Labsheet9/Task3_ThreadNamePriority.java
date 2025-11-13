package Labsheet9;

/*
  3. Write a program to display the current thread's name and priority.
*/
public class Task3_ThreadNamePriority {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Task3: Current thread name: " + t.getName());
        System.out.println("Task3: Current thread priority: " + t.getPriority());
    }
}
