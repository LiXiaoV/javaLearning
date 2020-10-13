package com.xiaov.extendsandabstract.extendslearn;

/**
 * @author xiaov
 * @create_time 2020-10-13 12:49 上午
 */
public class Zi extends Fu {
    int numZi = 20;
    int num = 200;

    @Override
    public void method() {
        int num = 300;
        System.out.println("num = " + num);
        System.out.println("this.num = " + this.num);
        System.out.println("super.num = " + super.num);
    }
}
