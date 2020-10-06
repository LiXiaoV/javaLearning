package com.xiaov.thread;

/**
 * public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 */

public class DemoSleep {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
