package org.example.Multithreading;

public class IntrruptTest extends Thread {

    @Override
    public void run(){
        try{
            sleep(1000);
        }catch(InterruptedException ex){
            System.out.println("thread interrupted");
        }
        {
            System.out.println("execution continued");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        IntrruptTest test = new IntrruptTest();
        test.start();
//        test.interrupt();
        test.join(); // only after thread is executed, next block will be called.
        System.out.println("main thread executed");
    }

}
