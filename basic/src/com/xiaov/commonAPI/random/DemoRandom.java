package com.xiaov.commonAPI.random;

import java.util.Random;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:19 下午
 */
public class DemoRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println("随机数是： " + num);
    }
}
