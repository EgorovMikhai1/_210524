package com.app._2024_10_23;

import java.util.concurrent.*;

public class FuEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        Tas t = new Tas();

        Future<Long> future = service.submit(t);
        Long result = future.get();

        System.out.println(result);

    }
}

class Tas implements Callable<Long> {
    long counter = 0;

    @Override
    public Long call() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(2222222);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println(counter);
        }

        return counter;
    }
}