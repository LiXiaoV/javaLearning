package com.xiaov.commonAPI.string;

/**
 * @author xiaov
 * @create_time 2020-10-07 11:08 上午
 */

/**
 * 程序中直接写上双引号字符串，就在字符串常量池中
 */
public class DemoStringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str4 = "abc";
        System.out.println("第一个字符串 = " + str1);

        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);
        System.out.println("第二个字符串 = " + str2);

        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("第三个字符串 = " + str3);

//        char[] chars1 = {'a', 'b', 'c'};
        String str5 = new String(chars);
        System.out.println("第五个字符串 = " + str5);

        System.out.println("str1 == str4 ? " + (str1 == str4));
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1 == str3 ? " + (str1 == str3));
        System.out.println("str2 == str5 ? " + (str2 == str5));
    }
}
