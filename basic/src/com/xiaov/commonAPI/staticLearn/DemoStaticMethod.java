package com.xiaov.commonAPI.staticLearn;

/**
 * @author xiaov
 * @create_time 2020-10-07 7:23 下午
 */

/**
 * 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用
 * 静态不能直接访问非静态：内存当中先有静态，后有非静态
 * 静态方法中不能使用this关键字
 * <p>
 * 本类的静态方法可以直接使用
 */
public class DemoStaticMethod {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();

        myClass.methodStatic();//不推荐
        MyClass.methodStatic();//推荐
    }
}
