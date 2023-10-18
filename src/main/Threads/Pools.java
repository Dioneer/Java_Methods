package main.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pools {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyThreads("AAAAAA"));
            executorService.execute(new MyThreads("BBBBBB"));
            executorService.execute(new MyThreads("CCCCCC"));
            executorService.execute(new MyThreads("DDDDDD"));
            executorService.execute(new MyThreads("EEEEEE"));
        }
    }
}
class MyThreads extends Thread{
    String name;
    public MyThreads(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i +" "+name);
        }
    }
}

