package com.xiaov.thread.threadSafe;

/**
 * 实现卖票案例
 */
public class RunnableImplSync implements Runnable {
    //定义线程共享资源
    private int tickets = 100;

    Object object = new Object();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (true) {
            synchronized (object) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "-->" + "正在卖" + tickets + "号票");
                    tickets--;
                } else
                    break;
            }

        }

    }
}
