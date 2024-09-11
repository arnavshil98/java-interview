package org.example.CommonCodingQuestions.arraygfg;

public class SynchClass extends Thread{

    int i;

    public void increment(String li) {
        for (int k = 0; k <= 10; k++) {
            i = i+1;
            System.out.println(li +" i: "+ i);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        SynchClass synchClass = new SynchClass();

        Thread thread = new Thread(){
            @Override
            public void run(){
                synchClass.increment("xyz");
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run(){
                synchClass.increment("pqr");
            }
        };


        thread.start();
        thread.join();
        thread2.start();
    }



}
