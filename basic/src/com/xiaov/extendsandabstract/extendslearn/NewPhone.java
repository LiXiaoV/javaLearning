package com.xiaov.extendsandabstract.extendslearn;

/**
 * @author xiaov
 * @create_time 2020-10-13 10:00 上午
 */
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();
        System.out.println("显示号码...");
        System.out.println("显示头像...");
    }
}
