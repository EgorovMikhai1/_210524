package com.app._2024_10_23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exmp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        TaskTP task = new TaskTP();

        service.submit(task);

    }
}

class TaskTP implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("RUN");
        }
    }
}