package com.xiaov.commonAPI.string;

/**
 * @author xiaov
 * @create_time 2020-10-07 11:00 上午
 */

/**
 * 三种构造+一种直接创建
 */
public class DemostringConstruct {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串 = " + str1);

        char[] chars = {'A', 'B', 'C'};
        String str2 = new String(chars);
        System.out.println("第二个字符串 = " + str2);

        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("第三个字符串 = " + str3);

        String str4 = "hello world";
        System.out.println("第四个字符串 = " + str4);
    }
}
