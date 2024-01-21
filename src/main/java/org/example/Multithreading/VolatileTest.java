package org.example.Multithreading;

// Java Program to demonstrate the
// use of Volatile Keyword in Java

public class VolatileTest {

    private static volatile int MY_INT = 0;

    static class ChangeListener extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (local_value < 5) {
                if (local_value != MY_INT) {
                    System.out.println("Got Change for MY_INT : {0} " + MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 5) {
                MY_INT = ++local_value;
                System.out.println("Incrementing MY_INT to {0} "+ MY_INT);
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

}
