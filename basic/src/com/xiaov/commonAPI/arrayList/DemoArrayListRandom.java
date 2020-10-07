package com.xiaov.commonAPI.arrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xiaov
 * @create_time 2020-10-07 10:12 上午
 */
public class DemoArrayListRandom {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);
        }
        for (Integer integer : list) {
            System.out.println("integer = " + integer);
        }
    }
}
