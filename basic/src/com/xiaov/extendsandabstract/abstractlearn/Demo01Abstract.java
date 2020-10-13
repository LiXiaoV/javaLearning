package com.xiaov.extendsandabstract.abstractlearn;

/**
 * @author xiaov
 * @create_time 2020-10-13 2:58 下午
 */
public class Demo01Abstract {
    public static void main(String[] args) {
        JinMao jinMao = new JinMao();
        jinMao.eat();
        jinMao.sleep();

        System.out.println("============");

        ErHa erHa = new ErHa();
        erHa.eat();
        erHa.sleep();
    }
}
