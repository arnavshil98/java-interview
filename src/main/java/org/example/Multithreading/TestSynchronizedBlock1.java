package org.example.Multithreading;
class Table
{
    void  printTable(int n){
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(InterruptedException e){System.out.println(e);}
            }
    }//end of the method
}

//class MyThread1 extends Thread{
//    Table t;
//    MyThread1(Table t){
//        this.t=t;
//    }
//    @Override
//    public void run(){
//        t.printTable(5);
//    }
//
//}
//class MyThread2 extends Thread{
//   private Table t;
//    MyThread2(Table t){
//        this.t=t;
//    }
//   @Override
//    public void run(){
//        t.printTable(100);
//    }
//}

public class TestSynchronizedBlock1{
    public static void main(String args[]) throws InterruptedException {
        Table obj = new Table();//only one object
//        MyThread1 t1=new MyThread1(obj);
//        MyThread2 t2=new MyThread2(obj);
//        t1.start();
//        t2.start();

        Thread t1 = new Thread(()->{
            obj.printTable(5);
        });

        Thread t2 = new Thread(()->{
            obj.printTable(100);
        });

        t1.start();
        t1.join();
        t2.start();
    }
}    