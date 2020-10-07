package com.xiaov.commonAPI.arrayList;

import java.util.ArrayList;

/**
 * @author xiaov
 * @create_time 2020-10-07 10:21 上午
 */
public class DemoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("xiaov", 18));
//        list.add(new Person("xiaoming",19));
        printArray(list);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        printArray(integers);
    }

    public static void printArray(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) System.out.print("@");
        }
        System.out.println("}");
    }
}
