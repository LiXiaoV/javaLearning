package com.xiaov.thread.threadSafe;

/**
 * 实现卖票案例
 */
public class RunnableImpl implements Runnable {
    //定义线程共享资源
    private int tickets = 100;

    @Override
    public void run() {
        while (true){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName()+"-->"+"正在卖"+tickets+"号票");
                tickets--;
            }else
                break;
        }

    }
}
