package com.xiaov.thread;

/**
 * 获取线程名称：
 * 1. 使用Thread类中的方法getName() 返回线程名称
 * 2. 可以先获取当前正在执行的线程，使用getName()获取线程名称
 * static Thread currentThread() 返回当前正在执行的线程对象的引用
 */
public class DemoThreadGetName {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

//        new MyThread().start();
//        new MyThread().start();
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);
    }
}
