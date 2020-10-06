package com.xiaov.thread.threadPool;


public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":创建了一个新的线程任务");
    }
}
