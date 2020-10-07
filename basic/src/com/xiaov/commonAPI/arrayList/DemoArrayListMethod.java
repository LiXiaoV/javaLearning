package com.xiaov.commonAPI.arrayList;

import java.util.ArrayList;

/**
 * @author xiaov
 * @create_time 2020-10-07 9:43 上午
 */
public class DemoArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        System.out.println("初始化后" + list);
        Person xiaov = new Person("xiaov", 18);
        list.add(xiaov);
        Person xiaoming = new Person("xiaoming", 19);
        list.add(xiaoming);
        Person xiaohong = new Person("xiaohong", 20);
        list.add(xiaohong);
        System.out.println("赋值后： " + list);

        System.out.println("list.get(1) = " + list.get(1));

//        list.remove(1);
        list.remove(xiaov);
        System.out.println("remove后：list = " + list);
        System.out.println("remove后：ist.get(1) = " + list.get(1));

        System.out.println("循环遍历：");
        for (Person person : list) {
            System.out.println("person = " + person);
        }

        System.out.println("集合大小 = " + list.size());
    }
}
