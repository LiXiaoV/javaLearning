package com.xiaov.extendsandabstract.polymorphism.laptop;

/**
 * @author xiaov
 * @create_time 2020-10-15 12:56 上午
 */
public interface LaptopUSB {
    /**
     * 打开设备
     */
    public abstract void open();

    /**
     * 关闭设备
     */
    public abstract void close();
}
