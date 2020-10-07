package com.xiaov.commonAPI.scanner;

import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-06 5:40 下午
 */
public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a:");
        int a = scanner.nextInt();
        System.out.print("请输入b:");
        int b = scanner.nextInt();
        System.out.print("请输入c:");
        int c = scanner.nextInt();
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println("最大数 = " + max);
    }
}
