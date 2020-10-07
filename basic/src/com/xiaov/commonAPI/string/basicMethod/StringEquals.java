package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 11:24 上午
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 = "abc";

        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);

        System.out.println("(str1.equals(str2)) ? " + (str1.equals(str2)));

        System.out.println("(\"abc\".equals(str2)) ? " + ("abc".equals(str1))); //推荐
        System.out.println("(str1.equals(\"abc\")) ? " + (str1.equals("abc"))); //不推荐，str1为null会出异常

        //忽略大小写比较
        System.out.println("(\"ABC\".equalsIgnoreCase(\"abc\")) ? " + ("ABC".equalsIgnoreCase("abc")));
    }
}
