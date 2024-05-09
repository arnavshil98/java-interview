package org.example.Multithreading;

public class StaticSyncCounter {

    private static int i = 0;
    public  static void increment(){
        i++;
    }
    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(() -> {
            for(int k=1;k<=1000;k++){
                increment();
            }
        });

        Thread th2= new Thread(()->{
            for(int k=1;k<=1000;k++){
                increment();
            }
        });

        th1.start();
        th1.join();
        th2.start();
        th2.join();

        System.out.println("i:"+ i);
    }
}
