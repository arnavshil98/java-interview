package org.example;

public class MultithreadingRunnable {
int f = 1;
    public void print(int i){
        for(int s=0; s<4; s++){
            f = f*i;
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        MultithreadingRunnable multithreadingRunnable = new MultithreadingRunnable();

        Runnable rm1 = ()->{
            System.out.println("running thread1: " );
            multithreadingRunnable.print(1);
        };
        Runnable rm2 = ()->{
            System.out.println("running thread2: " );
            multithreadingRunnable.print(5);
        };
        new Thread(rm1).start();


        new Thread(rm2).start();

    }
}
