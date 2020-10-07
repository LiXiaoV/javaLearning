package com.xiaov.commonAPI.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xiaov
 * @create_time 2020-10-06 8:33 下午
 */

/*
 * 产生1~100的随机数
 * 输入数字猜，直到猜对
 * */
public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Boolean flag = true;
        while (flag) {

            int result = random.nextInt(100) + 1;
            while (true) {
                System.out.print("请输入你猜的数字：");
                int num = scanner.nextInt();
                if (result > num)
                    System.out.println("猜得小了");
                else if (result < num)
                    System.out.println("猜得大了");
                else {
                    System.out.println("你猜对了，正确答案是：" + result);
                    break;
                }
            }
            scanner.nextLine(); //吃掉最后一个数的回车
            while (true) {
                System.out.print("还要玩吗？（yes/no）");
                String str = scanner.nextLine();
//                System.out.println("str = " + str);
                if (str.equals("yes")) {
                    break;
                } else if (str.equals("no")) {
                    flag = false;
                    break;
                } else {
                    System.out.println(str + "不是正确的参数，请输入yes或no");
                }
            }

        }
    }
}
