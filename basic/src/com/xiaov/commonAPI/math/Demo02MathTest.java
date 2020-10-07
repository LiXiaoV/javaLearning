package com.xiaov.commonAPI.math;

/**
 * @author xiaov
 * @create_time 2020-10-07 8:18 下午
 */
public class Demo02MathTest {
    public static void main(String[] args) {
        int count = 0;
        for (int i = -11; i < 6; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
