package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 11:44 上午
 */
public class DemoSubString {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("str.substring(5) = " + str.substring(5));
        System.out.println("str.substring(1,3) = " + str.substring(1, 3));  //左闭右开
        //截取是产生了一个新字符串
    }
}
