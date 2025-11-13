package Labsheet10;

import java.util.Arrays;

/*
19. Use ThreadGroup to group multiple threads and list their states.
*/
public class Task19_ThreadGroupStates {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = new ThreadGroup("MyGroup");
        Runnable r = () -> {
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        };
        Thread t1 = new Thread(tg, r, "g1-t1");
        Thread t2 = new Thread(tg, r, "g1-t2");
        t1.start(); t2.start();
        Thread.sleep(50);
        Thread[] list = new Thread[tg.activeCount()];
        int n = tg.enumerate(list);
        for (int i=0;i<n;i++) {
            System.out.println(list[i].getName() + " - alive? " + list[i].isAlive());
        }
    }
}
