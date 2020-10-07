package com.xiaov.commonAPI.string.basicMethod;

import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-07 4:47 下午
 */
public class DemoStringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要统计的字符串：");
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        int lowerAlphabet = 0;
        int upperAlphabet = 0;
        int number = 0;
        int others = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') upperAlphabet++;
            else if (chars[i] >= 'a' && chars[i] <= 'z') lowerAlphabet++;
            else if (chars[i] >= '0' && chars[i] <= '9') number++;
            else others++;
        }
        System.out.println("upperAlphabet = " + upperAlphabet);
        System.out.println("lowerAlphabet = " + lowerAlphabet);
        System.out.println("number = " + number);
        System.out.println("others = " + others);
    }
}
