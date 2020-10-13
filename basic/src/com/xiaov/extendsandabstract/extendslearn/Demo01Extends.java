package com.xiaov.extendsandabstract.extendslearn;

/**
 * @author xiaov
 * @create_time 2020-10-12 10:45 下午
 */

/**
 * 定义测试类
 */
public class Demo01Extends {
    public static void main(String[] args) {
        // 创建一个讲师类对象
        Teacher teacher = new Teacher();
        // 为该员工类的name属性进行赋值
        teacher.name = "小明";

        // 调用该员工的printName()方法
        teacher.printName();

        // 调用Teacher类继承来的work()方法
        teacher.work();
    }
}
