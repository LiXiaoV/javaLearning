package com.xiaov.thread;

/**
 * 匿名内部类方法实现线程的创建
 */
public class DemoInnerClassThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i+":"+Thread.currentThread().getName() + "-->" +"thread创建" );
                }
            }
        };

        thread.start();


        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ":" + Thread.currentThread().getName() + "-->" + "Runnable创建");
                }
            }
        };
        Thread xiaov = new Thread(runnable, "xiaov");
        xiaov.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }


    }
}
