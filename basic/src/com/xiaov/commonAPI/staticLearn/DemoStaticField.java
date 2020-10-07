package com.xiaov.commonAPI.staticLearn;

import com.xiaov.commonAPI.arrayList.Person;

/**
 * @author xiaov
 * @create_time 2020-10-07 5:20 下午
 */
public class DemoStaticField {
    public static void main(String[] args) {
        Student xiaov = new Student("xiaov", 18);
        System.out.println(xiaov.toString());

        Student xiaoming = new Student("xiaoming", 19);
        System.out.println(xiaoming.toString());
    }
}
