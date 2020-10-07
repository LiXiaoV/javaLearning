package com.xiaov.commonAPI.scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-06 5:36 下午
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("num = " + num);
        String str = scanner.next();
        System.out.println("str = " + str);
    }
}
