package com.xiaov.thread.threadSafe;

/**
 * 实现卖票案例
 */
public class RunnableImplSyncFuncStatic implements Runnable {
    //定义线程共享资源
    private static int tickets = 100;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (true) {
            payTickets();
            if (tickets <= 0) break;
        }

    }

    public static synchronized void payTickets() {
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->" + "正在卖" + tickets + "号票");
            tickets--;
        }
    }
}
