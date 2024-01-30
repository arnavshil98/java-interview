package org.example.Multithreading;


class Incrementer extends Thread{

    public synchronized void printVal(int i){
        for(int s=1; s<=5; s++){
            try {
                System.out.println(s*i);
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println("interrupted");
            }

        }
    }
}
public class TestMultiThread {

    public static void main(String[] args) throws InterruptedException {
        Incrementer incrementer = new Incrementer();
        // anonymous inner class
        Thread th1 = new Thread(){
            @Override
            public void run(){
                incrementer.printVal(5);
            }
        };

        Thread th2 = new Thread(){
            @Override
            public void run(){
                incrementer.printVal(10);
            }
        };

        th1.start();
//        th1.join();
        th2.start();

    }


}
