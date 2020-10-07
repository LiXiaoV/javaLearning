package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 4:15 下午
 */
public class DemoStringConvert {
    public static void main(String[] args) {
        String str = "hello world";
        //转化为字符数组
        char[] chars = str.toCharArray();
        System.out.println("str.toCharArray() = " + chars);

        System.out.println("chars[0] = " + chars[0]);
        System.out.println("chars.length = " + chars.length);

        //转化为字节数组
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();

        //替换
        String replace = "how do you do?".replace("do", "**");
        System.out.println("replace = " + replace);
    }
}
