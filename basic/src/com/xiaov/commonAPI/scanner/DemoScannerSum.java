package com.xiaov.commonAPI.scanner;

import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-06 5:40 下午
 */
public class DemoScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
