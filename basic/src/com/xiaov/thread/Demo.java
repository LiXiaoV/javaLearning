package com.xiaov.thread;

/**
 * 创建多线程程序的第一种方式：创建Thread类的子类
 * java.lang.Thread类：是描述线程的类，我们想要实现多线程程序，就必须继承Thread类
 * <p>
 * 实现步骤：
 * 1. 创建一个Thread类的子类
 * 2. 在Thread类的子类中重写Thread中的run方法，设置线程任务（开启线程要做什么）
 * 3. 创建Thread类的子类对象
 * 4. 调用Thread类中的方法start方法，开启新的线程，执行run方法
 * void start（）使线程执行；java虚拟机调用该线程的run方法
 */
public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:" + i);
        }
    }
}
