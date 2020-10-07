package com.xiaov.thread.threadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现卖票案例
 */
public class RunnableImplSyncLock implements Runnable {
    //定义线程共享资源
    private int tickets = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (true) {

            try {
                lock.lock();
                if (tickets > 0) {
                    Thread.sleep(10);

                    System.out.println(Thread.currentThread().getName() + "-->" + "正在卖" + tickets + "号票");
                    tickets--;
                } else
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }

    }
}
