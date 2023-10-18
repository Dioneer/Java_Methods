package main.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * part1
         */
//        System.out.println("Hello world! " + Thread.currentThread().getName());
//        MyThread myThread = new MyThread();
//        myThread.start();
//        try{
////            Thread.sleep(1000);
//            myThread.join();
//        }catch(InterruptedException ex){
//            System.out.println(ex.getMessage());
//        }
//        Thread t2 = new Thread(new MyThreadRunnable());
//        t2.start();
//        System.out.println("Main thread is dead");
        /**
         * part2
         */
//        MySynchroThread synchro = new MySynchroThread();
//        Thread p1 = new Thread(synchro);
//        p1.start();
//        Thread p2 = new Thread(synchro);
//        p2.start();
//        Thread.sleep(1000);
//        System.out.println(synchro.getX());
        /**
         * part3
         */
        MyLockThread lock = new MyLockThread();
        Thread p1 = new Thread(lock);
        p1.start();
        Thread p2 = new Thread(lock);
        p2.start();
        Thread.sleep(1000);
        System.out.println(lock.getX());

    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread1"+ i+" "+Thread.currentThread().getName());
//            Thread.yield();
        }
    }
}
class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread2" + i + " " + Thread.currentThread().getName());
        }
    }
}

class MySynchroThread extends Thread{
    int x = 0;
   @Override
    public synchronized void  run(){
        for (int i = 0; i < 10000; i++) {
            int temp = x;
            temp++;
            x = temp;
        }
    }

    public int getX() {
        return x;
    }
}
class MyLockThread extends Thread{
    Lock lock = new ReentrantLock();
    int x = 0;
    @Override
    public void  run(){
        lock.lock();
        for (int i = 0; i < 10000; i++) {
            int temp = x;
            temp++;
            x = temp;
        }
        lock.unlock();
    }

    public int getX() {
        return x;
    }
}
