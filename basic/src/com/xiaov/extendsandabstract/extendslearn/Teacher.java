package com.xiaov.extendsandabstract.extendslearn;

/**
 * @author xiaov
 * @create_time 2020-10-13 12:41 上午
 */

/**
 * 定义讲师类Teacher 继承 员工类Employee
 */
public class Teacher extends Employee {
    // 定义一个打印name的方法

    public void printName() {
        System.out.println("name = " + name);
    }
}
