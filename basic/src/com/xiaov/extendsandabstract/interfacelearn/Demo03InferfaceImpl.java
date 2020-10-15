package com.xiaov.extendsandabstract.interfacelearn;

/**
 * @author xiaov
 * @create_time 2020-10-14 10:53 上午
 */
public class Demo03InferfaceImpl implements Demo01Inferface , Demo02Inferface{
    @Override
    public void method1() {
        System.out.println("method1的重写方法");
    }

    @Override
    public void method2() {
        System.out.println("method02的重写方法");
    }
}
