package com.xiaov.extendsandabstract.polymorphism.laptop;

/**
 * @author xiaov
 * @create_time 2020-10-15 1:01 上午
 */
public class KeyBoard implements LaptopUSB{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void tap(){
        System.out.println("敲击键盘");
    }
}
