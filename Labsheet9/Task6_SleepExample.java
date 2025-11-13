package Labsheet9;

/*
  6. Use Thread.sleep() to pause a thread for 2 seconds and print a message before and after sleeping.
*/
public class Task6_SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task6: About to sleep for 2 seconds - " + Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("Task6: Woke up after sleeping");
    }
}
