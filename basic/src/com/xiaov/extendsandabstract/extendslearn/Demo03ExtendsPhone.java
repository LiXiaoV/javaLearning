package com.xiaov.extendsandabstract.extendslearn;

/**
 * @author xiaov
 * @create_time 2020-10-13 10:04 上午
 */
public class Demo03ExtendsPhone {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.show();
        System.out.println("------");
        newPhone.call();
        System.out.println("------");
        newPhone.send();
    }
}
