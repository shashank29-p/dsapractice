package org.example.dsa.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorService {

  public static void main(String[] args) {
    java.util.concurrent.ExecutorService executorService= Executors.newSingleThreadExecutor();
    Future<?> future= executorService.submit(()->{
      try{
        System.out.println("Hello");
        Thread.sleep(30000);
        System.out.println("Finished");
      }catch (InterruptedException e) {
        System.out.println("Interrupted");
      }
    });

    try {
      future.get(1,TimeUnit.SECONDS);
    }  catch (TimeoutException | InterruptedException | ExecutionException e) {
      System.out.println("Cancelling");
      future.cancel(true);
    }

    executorService.shutdown();
  }

  private void completableFutureEquivalent(){
    java.util.concurrent.ExecutorService executorService= Executors.newSingleThreadExecutor();
    CompletableFuture<Void> cf=CompletableFuture.runAsync(()-> System.out.println("Hello"),executorService);
    try {
      cf.get(1,TimeUnit.SECONDS);
    }catch (TimeoutException | InterruptedException | ExecutionException e){
      cf.cancel(true);
    }
  }
}
