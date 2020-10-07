package com.xiaov.thread.waitAndNotify;

public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object object = new Object();

        //创建消费者
        new Thread() {
            @Override
            public void run() {
                synchronized (object) {
                    System.out.println("告知老板包子的种类和数量");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //唤醒之后执行的代码
                    System.out.println("开吃...");
                }
            }
        }.start();

        //创建一个生产者
        new Thread() {
            @Override
            public void run() {
                //花5秒做包子
                try {
                    System.out.println("做包子...");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (object) {
                    //告知顾客，可以吃包子了
                    System.out.println("包子做好了，可以吃了");
                    object.notify();
                }

            }
        }.start();

    }
}
