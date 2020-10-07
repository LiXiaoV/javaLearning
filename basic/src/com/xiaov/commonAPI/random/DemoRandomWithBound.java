package com.xiaov.commonAPI.random;

import java.util.Random;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:19 下午
 */
public class DemoRandomWithBound {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10);
            System.out.println("随机数是： " + num);
        }

    }
}
