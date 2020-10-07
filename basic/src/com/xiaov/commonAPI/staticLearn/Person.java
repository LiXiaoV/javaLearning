package com.xiaov.commonAPI.staticLearn;

/**
 * @author xiaov
 * @create_time 2020-10-07 7:33 下午
 */

/**
 * 静态代码块特点：当第一次用到本类时，只执行唯一一次
 */
public class Person {
    static {
        System.out.println("静态代码块执行");
    }

    public Person() {
        System.out.println("构造方法执行");
    }
}
