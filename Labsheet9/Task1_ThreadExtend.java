package Labsheet9;

/*
  1. Write a program that creates and runs a thread by extending the Thread class.
*/
public class Task1_ThreadExtend extends Thread {
    public void run() {
        System.out.println("Task1: Thread started using Thread.extend - " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1: i = " + i);
        }
        System.out.println("Task1: Thread finished");
    }

    public static void main(String[] args) {
        Task1_ThreadExtend t = new Task1_ThreadExtend();
        t.start();
    }
}
