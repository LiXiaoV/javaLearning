package com.xiaov.lambda;

public class DemoLambda {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ":创建了一个新线程");
            }
        }).start();

        //使用Lambda表达式实现多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ":创建了一个新线程");
        }).start();
    }
}
