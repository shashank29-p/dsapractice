package org.example.dsa.multithreading;

public class CompletableFuture {

    public static void main(String[] args) {
        java.util.concurrent.CompletableFuture<Integer> f1 =
                java.util.concurrent.CompletableFuture.supplyAsync(() -> api1());

        java.util.concurrent.CompletableFuture<Integer> f2 =
                java.util.concurrent.CompletableFuture.supplyAsync(() -> api2());

        java.util.concurrent.CompletableFuture<Integer> f3 =
                java.util.concurrent.CompletableFuture.supplyAsync(() -> api3());

        java.util.concurrent.CompletableFuture.allOf(f1,f2,f3).join();

        int average= (f1.join()+f2.join()+f3.join())/3;

        System.out.println(average);
    }

    public static int api1(){
        return 10;
    }

    public static int api2(){
        return 20;
    }

    public static int api3(){
        return 30;
    }
}
