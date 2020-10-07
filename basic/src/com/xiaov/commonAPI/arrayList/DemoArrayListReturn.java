package com.xiaov.commonAPI.arrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author xiaov
 * @create_time 2020-10-07 10:38 上午
 */
public class DemoArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100) + 1;
            list.add(num);
        }
        System.out.println("list = " + list);
        System.out.println("chooseEven(list) = " + chooseEven(list));
    }

    public static ArrayList<Integer> chooseEven(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) evens.add(num);
        }
        return evens;
    }
}
