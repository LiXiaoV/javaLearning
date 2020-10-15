package com.xiaov.extendsandabstract.polymorphism.laptop;

/**
 * @author xiaov
 * @create_time 2020-10-15 1:04 上午
 */
public class Computer {
    public void open(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }

    public void useUsb(LaptopUSB laptopUSB){
        laptopUSB.open();

        if(laptopUSB instanceof Mouse){
            ((Mouse) laptopUSB).click();
        }else if(laptopUSB instanceof  KeyBoard){
            ((KeyBoard) laptopUSB).tap();
        }

        laptopUSB.close();
    }
}
