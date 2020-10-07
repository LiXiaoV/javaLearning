package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 11:36 上午
 */
public class StringGet {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.concat(\" world\") = " + str.concat(" world"));
        System.out.println("str.charAt(3) = " + str.charAt(4));
        System.out.println("str.indexOf(\"llo\") = " + str.indexOf("llo")); //如果没有返回-1值，有返回第一次
    }
}
