package Labsheet9;

/*
  7. Demonstrate thread synchronization by creating a bank account class where two threads try to withdraw money.
*/
public class Task7_BankSync {
    static class BankAccount {
        private int balance;
        BankAccount(int b){ balance = b; }

        public synchronized boolean withdraw(int amount) {
            if (amount <= balance) {
                System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdraw. Remaining: " + balance);
                return true;
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient funds. Remaining: " + balance);
                return false;
            }
        }

        public int getBalance(){ return balance; }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        Runnable r = () -> {
            for (int i=0;i<3;i++) {
                acc.withdraw(50);
            }
        };

        Thread t1 = new Thread(r, "Client-1");
        Thread t2 = new Thread(r, "Client-2");

        t1.start(); t2.start();
    }
}
