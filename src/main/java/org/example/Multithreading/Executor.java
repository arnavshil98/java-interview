package org.example.Multithreading;
import java.lang.Thread;
 class ThreadClassTest {
     int i;

    public ThreadClassTest(int i) {
        this.i = i;
    }

    public void increment() {
        synchronized (this) {
            for (int s = 0; s <= 5; s++) {

                System.out.println(i);
                i = i + 1;
            }
        }
    }
}

    class A extends Thread{
        ThreadClassTest test;

        public A(ThreadClassTest a){
            this.test =a;
        }

        @Override
        public void run(){
            test.increment();
        }
    }

    class B extends Thread{
        ThreadClassTest test;

        public B(ThreadClassTest a){
            this.test =a;
        }

        @Override
        public void run(){
            test.increment();
        }
    }


    public class Executor{
    public static void main(String[] args) throws InterruptedException {

        ThreadClassTest test = new ThreadClassTest(1);
        A a = new A(test);
        B b = new B(test);

        a.start();
        b.start();

        Runnable rn = test::increment;
        Thread t1 = new Thread(rn);
        t1.start();

        Thread th = new Thread(){
          @Override
          public void run(){
              test.increment();
          }
        };
        th.start();
    }


}
