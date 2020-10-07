package com.xiaov.commonAPI.anonymous;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:03 下午
 */
public class DemoAnonymous {
    public static void main(String[] args) {
        //匿名对象只能使用唯一一次，下次使用不得不再创建一个新对象
        //使用建议：如果确定一个对象只需要使用唯一一次
        new Person("xiaov").showName();
    }
}
