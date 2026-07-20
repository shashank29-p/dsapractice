package org.example.dsa.multithreading;

import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {
        java.util.concurrent.ExecutorService executorService= Executors.newFixedThreadPool(2);
        NumberOrder numberOrder=new NumberOrder();
        executorService.submit(()->{
            try{
                numberOrder.printOdd();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        executorService.submit(()->{
            try{
                numberOrder.printEven();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        executorService.shutdown();
    }

    static class NumberOrder{
        private int number=0;

        public synchronized void printOdd() throws InterruptedException {
            while (number<20){
                while(number%2!=0) wait();
                System.out.println(Thread.currentThread().getName()+":"+number);
                number++;
                notify();
            }
        }

        public synchronized void printEven() throws InterruptedException {
            while (number<20){
                while(number%2==0) wait();
                System.out.println(Thread.currentThread().getName()+":"+number);
                number++;
                notify();
            }
        }
    }
}
