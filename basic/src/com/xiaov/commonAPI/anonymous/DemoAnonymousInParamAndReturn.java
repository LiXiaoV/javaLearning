package com.xiaov.commonAPI.anonymous;

import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:13 下午
 */
public class DemoAnonymousInParamAndReturn {
    public static void main(String[] args) {
        Scanner scanner = methodReturn();
        methodParam(scanner);
    }

    /**
     * 匿名对象作为参数传递
     *
     * @param scanner
     */
    public static void methodParam(Scanner scanner) {
        System.out.print("请输入一个数字：");
        int num = scanner.nextInt();
        System.out.println("输入的参数为： " + num);
    }

    /**
     * 匿名对象作为返回值返回
     *
     * @return
     */
    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
