package com.xiaov.thread;

public class DemoSetThreadName {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.setName("xiaov");
//        myThread.start();
        MyThread xiaov = new MyThread("xiaov");
        xiaov.start();
    }
}
