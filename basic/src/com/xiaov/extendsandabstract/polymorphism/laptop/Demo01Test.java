package com.xiaov.extendsandabstract.polymorphism.laptop;

/**
 * @author xiaov
 * @create_time 2020-10-15 1:08 上午
 */
public class Demo01Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();

        System.out.println("==========");
        LaptopUSB laptopUSB = new Mouse();
        computer.useUsb(laptopUSB);

        System.out.println("========");
        LaptopUSB laptopUSB1 = new KeyBoard();
        computer.useUsb(laptopUSB1);

        System.out.println("=======");
        computer.close();
    }
}
