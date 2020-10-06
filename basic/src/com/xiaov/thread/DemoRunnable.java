package com.xiaov.thread;

/**
 * 创建多线程的第二种方法：实现Runnable接口
 *
 * 实现步骤：
 *      1. 创建一个runnable接口的实现类
 *      2. 在实现类中重写Runnable接口的run方法，设置线程任务
 *      3. 创建一个Runnable接口的实现类对象
 *      4. 创建一个Thread类对象，构造方法中传递Runnable接口的实现类对象
 *      5. 调用Thread类中的Start方法，开启线程执行方法
 */
public class DemoRunnable {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread xiaov = new Thread(runnable, "xiaov");
        xiaov.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }


}
