package com.xiaov.commonAPI.arrayList;

import java.util.ArrayList;

/**
 * @author xiaov
 * @create_time 2020-10-07 9:55 上午
 */

/**
 * JDK1.5之后能自动装箱、拆箱
 * 自动装箱：基本类型 --> 包装类型
 * 自动拆箱：包装类型 --> 基本类型
 */
public class DemoArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        int num = list.get(2);
        System.out.println("num = " + num);
    }
}
