package com.wuroc.javatest;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestAB {
    public static void main(String[] args) {

    ThreadPoolExecutor executor = new ThreadPoolExecutor(
            1,
            100,
            100,
            TimeUnit. SECONDS, new LinkedBlockingDeque<>(100));

    for(int i = 0; i < 5; i++) {
        final int taskIndex = i;
        executor.execute(() -> {
            System.out.println(taskIndex);
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
}
    }
    }
