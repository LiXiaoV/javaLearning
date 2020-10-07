package com.xiaov.commonAPI.anonymous;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:04 下午
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("我的名字是： " + name);
    }
}
