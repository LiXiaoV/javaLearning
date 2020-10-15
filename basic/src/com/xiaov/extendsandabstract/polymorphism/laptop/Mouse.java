package com.xiaov.extendsandabstract.polymorphism.laptop;

/**
 * @author xiaov
 * @create_time 2020-10-15 12:59 上午
 */
public class Mouse implements LaptopUSB{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
