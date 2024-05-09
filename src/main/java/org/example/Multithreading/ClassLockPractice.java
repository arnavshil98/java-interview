package org.example.Multithreading;

// class level lock not an instance level lock
public class ClassLockPractice extends Thread{

    public static int incrementer = 0;

    public static synchronized void setIncrementor(){
        try {
            for(int i = 0; i<=5; i++) {
                System.out.println("incrementor: " + incrementer);
                incrementer = incrementer + 1;
                sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("thread interrupted");
        }
    }
    public static void main(String[] args) {
        Thread th1 = new Thread(){
            @Override
            public void run() {
                ClassLockPractice.setIncrementor();
            }
        };

        Thread th2 = new Thread(){
            @Override
            public void run() {
                ClassLockPractice.setIncrementor();
            }
        };
        th1.start();
        th2.start();
    }
}
