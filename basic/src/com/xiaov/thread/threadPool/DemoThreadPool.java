package com.xiaov.thread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 6; i++) {
            executorService.submit(new RunnableImpl());
        }
        executorService.shutdown(); //销毁之后线程池就没了

    }
}
