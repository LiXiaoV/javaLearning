package com.xiaov.commonAPI.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-07 8:00 下午
 */
public class DemoArraySortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.nextLine();
        sortAndPrint(str);
    }

    public static void sortAndPrint(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
