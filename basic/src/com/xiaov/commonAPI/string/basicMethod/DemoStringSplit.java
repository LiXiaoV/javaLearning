package com.xiaov.commonAPI.string.basicMethod;

/**
 * @author xiaov
 * @create_time 2020-10-07 4:28 下午
 */
public class DemoStringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc,ddd";
        String[] split = str.split(",");    //参数其实是正则表达式，如果按"."来切分，regex必须是"\\."
        for (String s : split) {
            System.out.println(s);
        }
    }
}
