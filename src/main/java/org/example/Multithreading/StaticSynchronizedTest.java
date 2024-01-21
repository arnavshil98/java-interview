package org.example.Multithreading;



class App {

    public static synchronized void print(int i) {
        for (int s = 1; s <= 5; s++) {
            System.out.println(s * i);
        }
    }
}
public class StaticSynchronizedTest {
    public static void main(String[] args) {


        Thread th1 = new Thread(){
            @Override
            public void run(){
                App.print(1);
            }
        };

        Thread th2 = new Thread(){
            @Override
            public void run(){
                App.print(10);
            }
        };

        Thread th3 = new Thread(){
            @Override
            public void run(){
                App.print(100);
            }
        };

        th1.start();
        th2.start();
        th3.start();

        }
    }

